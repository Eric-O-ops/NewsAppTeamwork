package com.eric.newsappteamwork.presentation.ui.fragments

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.eric.newsappteamwork.R
import com.eric.newsappteamwork.common.base.BaseFragment
import com.eric.newsappteamwork.databinding.FragmentAppleNewsBinding

class AppleNewsFragment :
    BaseFragment<FragmentAppleNewsBinding, AppleNewsViewModel>(R.layout.fragment_apple_news) {

    override val binding by viewBinding(FragmentAppleNewsBinding::bind)
    override val viewModel: AppleNewsViewModel by viewModels()


    override fun initialize() {
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
        }
    }
}