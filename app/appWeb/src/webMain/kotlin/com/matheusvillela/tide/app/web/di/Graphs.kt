package com.matheusvillela.tide.app.web.di

import com.matheusvillela.tide.app.shared.di.Platform
import com.matheusvillela.tide.app.web.WebPlatform
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import dev.zacsweers.metrox.viewmodel.ViewModelGraph

@DependencyGraph(AppScope::class)
interface AppGraph : ViewModelGraph {
    @Provides
    fun providePlatform(): Platform = WebPlatform()
}
