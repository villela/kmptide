plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
}

group = "com.matheusvillela.tide"
version = "1.0.0"
application {
    mainClass = "com.matheusvillela.tide.server"
}

dependencies {
    implementation(projects.core.dto)
    implementation(libs.logback)
    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    testImplementation(libs.ktor.serverTestHost)
    testImplementation(libs.kotlin.testJunit)
}