plugins {

    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.google.firebase.crashlytics)
    alias(libs.plugins.google.gms.google.services) apply false
}

android {
    namespace = "com.playconsole.aprendeprogramar2"
    compileSdk = 34
    defaultConfig {
        minSdk = 26
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

repositories {
    google()
    mavenCentral()
}



dependencies {
    implementation(libs.play.services.ads)
    implementation(libs.play.services.maps)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.runtime)
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.crashlytics)
    implementation(libs.firebase.database)
    implementation(libs.firebase.perf)
    implementation(libs.firebase.vertexai)

}
