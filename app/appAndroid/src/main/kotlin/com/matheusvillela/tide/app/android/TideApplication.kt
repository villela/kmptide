package com.matheusvillela.tide.app.android

import android.app.Application
import com.matheusvillela.tide.app.android.di.AppGraph
import dev.zacsweers.metro.createGraph
import dev.zacsweers.metrox.android.MetroAppComponentProviders
import dev.zacsweers.metrox.android.MetroApplication

internal class TideApplication : Application(), MetroApplication {
    override val appComponentProviders: MetroAppComponentProviders by lazy { createGraph<AppGraph>() }
}
