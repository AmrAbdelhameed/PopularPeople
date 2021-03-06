package com.example.popularpeople.presentation.main.popular_details

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class PopularDetailsFragmentProvider {
    @ContributesAndroidInjector
    abstract fun providePopularDetailsFragmentFactory(): PopularDetailsFragment
}