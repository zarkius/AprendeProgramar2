// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.firebase.crashlytics)
    alias(libs.plugins.google.gms.google.services) apply false
    alias(libs.plugins.google.firebase.firebase.perf)
}

android {
    namespace = "com.playconsole.AprendeProgramar2"
    compileSdk = 35
    defaultConfig {
        minSdk = 26
        versionCode = 2
        versionName = "1.0"
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            signingConfig = signingConfigs.getByName("debug")
        }
    }
    buildFeatures {
        compose = true
        }
    buildToolsVersion = "35.0.0"
    ndkVersion = "28.0.12674087 rc2"
    dependenciesInfo {
        includeInApk = false
        includeInBundle = false
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}
dependencies {
    implementation(libs.play.services.ads)
    implementation(libs.play.services.maps)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.runtime)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)// Example within the Firebase group:
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.database)
    implementation(libs.firebase.perf)
    implementation(libs.firebase.vertexai)

}
