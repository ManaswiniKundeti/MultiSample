buildscript{
    dependencies{
        classpath("dev.icerock.moko:resources-generator:0.23.0")
        classpath ("com.squareup.sqldelight:gradle-plugin:1.5.5")
    }
}

plugins {
    //trick: for the same plugin versions in all sub-modules
    kotlin("multiplatform").apply(false)
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
