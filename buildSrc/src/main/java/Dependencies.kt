object Versions {

    const val application = "7.3.1"
    const val androidLibrary = "7.3.1"
    const val kotlinAndroid = "1.7.20"
    const val hilt = "2.42"
    const val appcompat = "1.5.1"
    const val material = "1.7.0"
    const val constraintLayout = "2.1.4"
    const val viewBindingDelegate = "1.4.7"
    const val navVersion = "2.5.2"
    const val coroutinesAndroid = "1.6.4"
    const val coroutinesCore = "1.3.9"
    const val retrofit = "2.9.0"
    const val kotlinActivity = "1.3.0"
    const val fragmentKtx = "1.3.6"
    const val okhttpBom = "5.0.0-alpha.6"

    // Tests
    const val junit = "4.13.2"
    const val extJUnit = "1.1.5"
    const val espressoCore = "3.5.1"
}

object Plugins {

    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kapt = "kapt"
    const val androidLibrary = "com.android.library"
    const val hilt = "com.google.dagger.hilt.android"
}

object Dependencies {

    object Core {

        const val core = "androidx.core:core-ktx:1.7.0"
    }

    object UIComponents {

        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object ViewBindingPropertyDelegate {

        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Versions.viewBindingDelegate}"
    }


    object DaggerHilt {

        const val daggerHilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltAndroidKapt = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    }


    object Retrofit2 {

        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }


    object OkHttp {

        const val okhttpBom = "com.squareup.okhttp3:okhttp-bom:${Versions.okhttpBom}"
        const val okhttp = "com.squareup.okhttp3:okhttp"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }


    object Coroutines {

        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroid}"
        const val coroutinesCore =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCore}"
    }


    object Navigation {

        const val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    }

    object KotlinActivity {

        const val activityKtx = "androidx.activity:activity-ktx:${Versions.kotlinActivity}"
    }

    object KotlinFragment {

        const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"
    }

    object Tests {

        const val junit = "junit:junit:${Versions.junit}"
        const val extJUnit = "androidx.test.ext:junit:${Versions.extJUnit}"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    }
}