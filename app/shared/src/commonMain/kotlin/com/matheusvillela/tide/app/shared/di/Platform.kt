package com.matheusvillela.tide.app.shared.di

fun interface Platform {
    fun invoke(): String
}
