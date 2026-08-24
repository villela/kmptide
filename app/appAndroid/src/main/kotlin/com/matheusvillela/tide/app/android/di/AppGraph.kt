package com.matheusvillela.tide.app.android.di

import com.matheusvillela.tide.app.android.AndroidPlatform
import com.matheusvillela.tide.app.shared.presentation.deps.Platform
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.DependencyGraph
import dev.zacsweers.metro.Provides
import dev.zacsweers.metrox.android.MetroAppComponentProviders
import dev.zacsweers.metrox.viewmodel.ViewModelGraph

@DependencyGraph(AppScope::class)
interface AppGraph : MetroAppComponentProviders, ViewModelGraph {
    @Provides
    fun providePlatform(): Platform = AndroidPlatform()
}
