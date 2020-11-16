package com.hilt.sample.hilt

import android.util.Log
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Inject

/**
 * 界面描述：
 * <p>
 * Created by tianyang on 2020/11/16.
 */
@Module
@InstallIn(ApplicationComponent::class)
abstract class HiltModule {

    @Binds
    abstract fun bindAnalyticsService(analyticsServiceImpl: AnalyticsServiceImpl): AnalyticsService
}

interface AnalyticsService {
    fun analyticsMethods()
}

class AnalyticsServiceImpl @Inject constructor() : AnalyticsService {

    override fun analyticsMethods() {
        Log.d("AnalyticsServiceImpl", "analyticsMethods...")
    }
}
