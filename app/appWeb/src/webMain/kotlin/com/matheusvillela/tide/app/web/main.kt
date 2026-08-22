package com.matheusvillela.tide.app.web

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.matheusvillela.tide.app.shared.App
import com.matheusvillela.tide.app.web.di.AppGraph
import dev.zacsweers.metro.createGraph

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    val appGraph = createGraph<AppGraph>()

    ComposeViewport {
        App(appGraph.metroViewModelFactory)
    }
}