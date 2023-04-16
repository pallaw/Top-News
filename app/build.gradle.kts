plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("kotlin-android-extensions")
    id("androidx.navigation.safeargs.kotlin")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdkVersion (29)
    buildToolsVersion  = "29.0.3"

    defaultConfig {
        applicationId  = "com.pallaw.topnews"
        minSdkVersion (21)
        targetSdkVersion (29)
        versionCode  = 1
        versionName  = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    buildTypes {
        getByName("release") {
            isMinifyEnabled  = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

// To inline the bytecode built with JVM target 1.8 into
// bytecode that is being built with JVM target 1.6. (e.g. navArgs)


    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

}

dependencies {
//    implementation fileTree(dir: "libs", include: ["*.jar"])
    var kotlin_version = "1.5.31"
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:${kotlin_version}")
    implementation ("androidx.appcompat:appcompat:1.3.1")
    implementation ("androidx.core:core-ktx:1.6.0")
    implementation ("com.google.android.material:material:1.4.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("androidx.recyclerview:recyclerview:1.2.1")
    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.3")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")

    // timber log
    var timber_version = "4.7.1"
    implementation ("com.jakewharton.timber:timber:${timber_version}")

    // jetpack lifecycle
    var lifecycle_version = "2.3.1"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:${lifecycle_version}")
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:${lifecycle_version}")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:${lifecycle_version}")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-savedstate:${lifecycle_version}")

    //Retrofit
    var retrofit_version = "2.8.1"
    var retrofit_interceptor_version = "4.5.0"
    implementation ("com.squareup.retrofit2:retrofit:${retrofit_version}")
    implementation ("com.squareup.retrofit2:converter-gson:${retrofit_version}")
    implementation ("com.squareup.retrofit2:adapter-rxjava2:${retrofit_version}")
    implementation ("com.squareup.okhttp3:logging-interceptor:${retrofit_interceptor_version}")

    //gson
    var gson_version = "2.8.6"
    implementation ("com.google.code.gson:gson:${gson_version}")

    //Room
    var room_version = "2.3.0"
    implementation ("androidx.room:room-runtime:${room_version}")
    kapt ("androidx.room:room-compiler:${room_version}")
    implementation ("androidx.room:room-ktx:${room_version}")

    // Glide
    var glide_version = "4.11.0"
    implementation ("com.github.bumptech.glide:glide:${glide_version}")

    // Paging
    var paging_version = "3.0.1"
    implementation ("androidx.paging:paging-runtime:${paging_version}")

    //Rx
    var rx_java_version = "2.2.9"
    var rx_adnroid_version = "2.1.1"
    implementation ("io.reactivex.rxjava2:rxjava:${rx_java_version}")
    implementation ("io.reactivex.rxjava2:rxandroid:${rx_adnroid_version}")

    //Hilt
    //Dagger - Hilt
    implementation ("com.google.dagger:hilt-android:2.28-alpha")
    kapt ("com.google.dagger:hilt-android-compiler:2.28-alpha")
    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha02")
    kapt ("androidx.hilt:hilt-compiler:1.0.0-alpha02")
    implementation ("androidx.activity:activity-ktx:1.1.0")
}
