package com.matheusvillela.tide.app.desktop.di

import com.matheusvillela.tide.app.desktop.DesktopPlatform
import com.matheusvillela.tide.app.shared.presentation.deps.Platform
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import dev.zacsweers.metrox.viewmodel.ViewModelGraph

@DependencyGraph(AppScope::class)
interface AppGraph : ViewModelGraph {
    @Provides
    fun providePlatform(): Platform = DesktopPlatform()
}
