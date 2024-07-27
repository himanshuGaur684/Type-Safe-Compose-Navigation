package gaur.himanshu.dashboard.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.dashboard.navigation.DashboardFeature
import gaur.himanshu.dashboard.navigation.DashboardFeatureImpl

@InstallIn(SingletonComponent::class)
@Module
object DashboardModule {

    @Provides
    fun provideDashboardFeature(): DashboardFeature {
        return DashboardFeatureImpl()
    }


}