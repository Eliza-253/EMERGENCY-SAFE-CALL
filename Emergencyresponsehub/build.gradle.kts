// Top-level build file

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // Firebase Google Services
        classpath("com.google.gms:google-services:4.4.0")
    }
}

plugins {
    id("com.android.application") version "8.9.1" apply false
    id("com.android.library") version "8.9.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.24" apply false
}
