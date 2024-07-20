package gaur.himanshu.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.ui.AuthFeatureApi
import gaur.himanshu.ui.AuthFeatureApiImpl

@InstallIn(SingletonComponent::class)
@Module
object AuthModule {


    @Provides
    fun provideAuthFeature():AuthFeatureApi{
        return AuthFeatureApiImpl()
    }


}