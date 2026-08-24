import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.metro)
}

dependencies {
    implementation(projects.app.shared.view)
    implementation(projects.app.shared.presentation) // needed for metro
    implementation(projects.app.shared.presentationDeps)

    implementation(compose.desktop.currentOs)

    implementation(libs.compose.ui)
    implementation(libs.metrox.viewmodel.compose)
}

compose.desktop {
    application {
        mainClass = "com.matheusvillela.tide.app.desktop.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.matheusvillela.tide"
            packageVersion = "1.0.0"
        }
    }
}