package com.ahs.hellohilt.di

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

// Marks this class as a Hilt module that provides app-level dependencies.
@Module
// Installs this module in the SingletonComponent, meaning the provided dependencies
// will live as long as the application (application-wide singleton scope).
@InstallIn(SingletonComponent::class)
object AppModule {

    // Provides a singleton instance of FirebaseFirestore across the entire app.
    @Provides
    @Singleton
    fun provideFirestore(): FirebaseFirestore = FirebaseFirestore.getInstance()

    // Provides a singleton instance of DataRepository, using the Firestore instance.
    @Provides
    @Singleton
    fun provideDataRepository(firestore: FirebaseFirestore): DataRepository =
        DataRepository(firestore)
}
