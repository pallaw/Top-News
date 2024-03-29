buildscript {
    val kotlin_version = "1.5.31"
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath ("com.android.tools.build:gradle:4.2.2")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlin_version}")
        classpath ("com.google.dagger:hilt-android-gradle-plugin:2.38.1")

        val nav_version = "2.3.0-alpha06"
        classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:${nav_version}")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()

    }
}

