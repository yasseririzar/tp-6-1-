// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}

    fun implementation(str: String) {
        println("Bonjour depuis Kotlin !")
    }

implementation("androidx.work:work-runtime:2.10.0")