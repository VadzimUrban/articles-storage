plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.devtools.ksp)
    alias(libs.plugins.jetbrains.kotlin.kapt)
    alias(libs.plugins.androidx.navigation.safeargs)
}

android {
    namespace = "com.example.articlesstorage"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.articlesstorage"
        minSdk = 27
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    ksp {
        arg("room.schemaLocation", "$projectDir/schemas")
    }


    kapt {
        correctErrorTypes = true
        useBuildCache = true
    }


    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Room
    implementation (libs.androidx.room.ktx)
    implementation (libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)

    // Dagger 2
    implementation(libs.com.google.dagger)
    kapt(libs.com.google.dagger.compiler)

    // Navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)


    // Lifecycle
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.activity.ktx)
    implementation (libs.androidx.fragment.ktx)
}