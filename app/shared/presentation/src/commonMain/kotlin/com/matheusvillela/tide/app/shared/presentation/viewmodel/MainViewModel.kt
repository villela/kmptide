package com.matheusvillela.tide.app.shared.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.matheusvillela.tide.app.shared.presentation.deps.Platform
import com.matheusvillela.tide.app.shared.presentation.state.MainViewModelState
import com.matheusvillela.tide.core.coroutine.util.mapState
import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.ContributesIntoMap
import dev.zacsweers.metro.Inject
import dev.zacsweers.metrox.viewmodel.ViewModelKey
import kotlinx.coroutines.flow.MutableStateFlow

@Inject
@ViewModelKey
@ContributesIntoMap(AppScope::class)
class MainViewModel(private val platform: Platform) : ViewModel() {
    private val platformValue = platform.invoke()
    private val count = MutableStateFlow(0)

    val state = count.mapState { value ->
        MainViewModelState(
            count = value,
            platform = platformValue,
        )
    }

    fun increment() {
        count.value++
    }

    fun decrement() {
        count.value--
    }
}