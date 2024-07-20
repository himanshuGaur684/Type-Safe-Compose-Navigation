package gaur.himanshu.composenavigation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.composenavigation.AppFeatureNavigator
import gaur.himanshu.dashboard.ui.DashboardFeature
import gaur.himanshu.ui.AuthFeatureApi
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Provides
    @Singleton
    fun provideNavigator(authFeatureApi: AuthFeatureApi,dashboardFeature: DashboardFeature): AppFeatureNavigator {
        return AppFeatureNavigator(authFeatureApi,dashboardFeature)
    }

}