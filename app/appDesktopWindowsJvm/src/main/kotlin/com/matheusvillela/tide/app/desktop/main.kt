package com.matheusvillela.tide.app.desktop

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.matheusvillela.tide.app.desktop.di.AppGraph
import com.matheusvillela.tide.app.shared.App
import dev.zacsweers.metro.createGraph

fun main() = application {
    val appGraph = createGraph<AppGraph>()
    Window(
        onCloseRequest = ::exitApplication,
        title = "Tide",
    ) {
        App(appGraph.metroViewModelFactory)
    }
}