package gaur.himanshu.dashboard.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.dashboard.ui.DashboardFeature
import gaur.himanshu.dashboard.ui.DashboardFeatureApiImpl

@InstallIn(SingletonComponent::class)
@Module
object DashboardUiModule
{

    @Provides
    fun provideDashboardFeatureApi():DashboardFeature{
        return DashboardFeatureApiImpl()
    }

}