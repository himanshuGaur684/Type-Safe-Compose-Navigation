package gaur.himanshu.composenavigation.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.composenavigation.DefaultNavigator
import gaur.himanshu.dashboard.navigation.DashboardFeature
import gaur.himanshu.navigation.AuthFeature

@InstallIn(SingletonComponent::class)
@Module
object AppModule {


    @Provides
    fun provideDefaultNavigator(
        authFeature: AuthFeature,
        dashboardFeature: DashboardFeature
    ): DefaultNavigator {
        return DefaultNavigator(authFeature, dashboardFeature)
    }


}