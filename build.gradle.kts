plugins {
    id("com.android.application") version "8.2.0"
    id("org.jetbrains.kotlin.android") version "1.9.0"
}

android {
    // Klasör yapısıyla tam uyumlu benzersiz paket adı
    namespace = "com.ilham.wachecker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.ilham.wachecker"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
