package com.example.buildSrc

import org.gradle.api.JavaVersion

object Versions {
    const val VERSION_NAME = "1.0.0"
    const val VERSION_CODE = 1
    const val COMPILE_SDK = 31
    const val TARGET_SDK = 31
    const val MIN_SDK = 23
    const val BUILD_TOOLS = "30.0.3"
    const val GRADLE_PLUGIN = "7.0.3"
    const val COMPOSE_VERSION = "1.0.1"
}

object Modules {

    object Base {
        const val ARCH = ":app:base:arch"
        const val DATA = ":app:base:data"
        const val DOMAIN = ":app:base:domain"
        const val PRESENTATION = ":app:base"
    }

    // Features
    object Features {

        object Anime {
            const val DOMAIN = ":app:features:anime:domain"
            const val DATA = ":app:features:anime:data"
            const val PRESENTATION = ":app:features:anime"
        }
    }

    object Libs {
        const val RETROFIT_API = ":app:base:data:api"
    }
}

object Libs {

    object AndroidX {
        const val CORE_KTX = "androidx.core:core-ktx:1.7.0"
        const val APPCOMPAT = "androidx.appcompat:appcompat:1.3.1"
        const val MATERIAL = "com.google.android.material:material:1.4.0"

        const val COMPOSE_UI = "androidx.compose.ui:ui:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_MATERIAL = "androidx.compose.material:material:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_UI_TOOLING = "androidx.compose.ui:ui-tooling-preview:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_ACTIVITY = "androidx.activity:activity-compose:1.3.1"
        const val COMPOSE_ANDROID_TEST = "androidx.compose.ui:ui-test-junit4:${Versions.COMPOSE_VERSION}"
        const val COMPOSE_DEBUG = "androidx.compose.ui:ui-tooling:${Versions.COMPOSE_VERSION}"
    }

    object Kotlin {
        const val VERSION = "1.5.31"
        const val STD_LIB = "org.jetbrains.kotlin:kotlin-stdlib:$VERSION"
        const val REFLECT = "org.jetbrains.kotlin:kotlin-reflect:$VERSION"

        object Coroutines {
            private const val VERSION = "1.5.1"
            const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$VERSION"
            const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$VERSION"
        }
    }

    object DI {
        object KOIN {
            private const val VERSION = "3.1.4"
            const val KOIN = "io.insert-koin:koin-core:$VERSION"
            const val KOIN_ANDROID = "io.insert-koin:koin-android:$VERSION"
            const val KOIN_ANDROID_NAVIGATION = "io.insert-koin:koin-androidx-navigation:$VERSION"
            const val KOIN_JETPACK_COMPOSE = "io.insert-koin:koin-androidx-compose:$VERSION"
            const val KOIN_TEST = "io.insert-koin:koin-test:$VERSION"

        }
    }

    object Network {
        const val RETROFIT = "com.squareup.retrofit2:retrofit:2.9.0"
        const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:4.9.0"

        object Serializer {
            const val MOSHI_CONVERTER = "com.squareup.retrofit2:converter-moshi:2.9.0"
            const val MOSHI = "com.squareup.moshi:moshi:1.12.0"
            const val MOSHI_KOTLIN = "com.squareup.moshi:moshi-kotlin:1.12.0"
            const val MOSHI_CODEGEN = "com.squareup.moshi:moshi-kotlin-codegen:1.12.0"
            const val MOSHI_ADAPTERS = "com.squareup.moshi:moshi-adapters:1.8.0"
        }
    }

    object Logging {
        const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
        const val CHUCKER_DEBUG = "com.github.chuckerteam.chucker:library:3.4.0"
        const val CHUCKER_RELEASE = "com.github.chuckerteam.chucker:library-no-op:3.4.0"
    }

    object Navigation {
        private const val VERSION = "2.4.0-rc01"
        const val NAVIGATION_COMPOSE = "androidx.navigation:navigation-compose:$VERSION"
    }

    object Lifecycle {
        private const val VERSION = "2.4.0"
        const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
        const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$VERSION"
        const val RUNTIME = "androidx.lifecycle:lifecycle-runtime-ktx:$VERSION"
        const val RUNTIME_COMPOSE = "androidx.compose.runtime:runtime-livedata:1.0.5"
        const val SAVED_STATE = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$VERSION"
        const val JAVA_8 = "androidx.lifecycle:lifecycle-common-java8:$VERSION"
        const val COMPILER = "androidx.lifecycle:lifecycle-compiler:$VERSION" /* kapt */
    }


    object Animations {
        const val SHIMMER = "com.facebook.shimmer:shimmer:0.5.0"
    }

    object Images {
        const val GLIDE = "com.github.bumptech.glide:glide:4.12.0"
        const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:4.12.0"
    }
}