package com.ahs.hellohilt.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

// Marks the Application class as the entry point for Hilt dependency injection.
// This annotation triggers Hilt's code generation, including a base class
// that the application class extends to set up the dependency graph.
@HiltAndroidApp
class Applications:Application()