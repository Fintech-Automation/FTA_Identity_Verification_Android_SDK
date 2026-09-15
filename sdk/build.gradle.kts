plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.fta.sdk.android.identity.sdk"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    publishing {
        singleVariant("release")
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

//    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.aar"))))
    api(files("libs/fta-identity-verification-android-sdk-release.aar"))

}