package com.eric.newsappteamwork.common.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import androidx.viewbinding.ViewBinding
import com.eric.newsappteamwork.common.either.Either
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

abstract class BaseFragment<VB : ViewBinding, VM : ViewModel>(@LayoutRes idLayout: Int) :
    Fragment(idLayout) {

    protected abstract val binding: VB
    protected abstract val viewModel: VM

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupListener()
        setupSubscribes()
    }

    protected open fun initialize() {}

    protected open fun setupListener() {}

    protected open fun setupSubscribes() {}

    protected open fun <T> Flow<Either<String, List<T>>>.subscribe(
        left: (error: String) -> Unit,
        right: ((data: List<T>) -> Unit),
    ) {
        lifecycleScope.launch {
            collect { either ->
                when (either) {
                    is Either.Left -> {
                        left(either.massage.toString())
                    }
                    is Either.Right -> {
                        either.data?.let { data ->
                            right(data)
                        }
                    }
                }
            }
        }
    }
}