package com.matheusvillela.tide.app.shared

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import com.matheusvillela.tide.app.shared.view.screen.MainScreen
import dev.zacsweers.metrox.viewmodel.LocalMetroViewModelFactory
import dev.zacsweers.metrox.viewmodel.MetroViewModelFactory

@Composable
fun App(metroVmf: MetroViewModelFactory) {
    CompositionLocalProvider(LocalMetroViewModelFactory provides metroVmf) {
        MaterialTheme {
            MainScreen()
        }
    }
}
