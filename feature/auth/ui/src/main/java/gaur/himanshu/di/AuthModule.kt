package gaur.himanshu.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import gaur.himanshu.navigation.AuthFeature
import gaur.himanshu.navigation.AuthFeatureImpl

@InstallIn(SingletonComponent::class)
@Module
object AuthModule {


        @Provides
        fun provideAuthFeature(): AuthFeature {
            return AuthFeatureImpl()
        }


}