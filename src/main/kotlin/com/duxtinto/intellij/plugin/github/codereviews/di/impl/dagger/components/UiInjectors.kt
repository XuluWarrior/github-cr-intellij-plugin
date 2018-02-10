package com.duxtinto.intellij.plugin.github.codereviews.di.impl.dagger.components

import com.duxtinto.intellij.plugin.github.codereviews.presentation.toolwindow.ToolWindowFactory

interface UiInjectors {
    fun inject(factory: ToolWindowFactory)
}