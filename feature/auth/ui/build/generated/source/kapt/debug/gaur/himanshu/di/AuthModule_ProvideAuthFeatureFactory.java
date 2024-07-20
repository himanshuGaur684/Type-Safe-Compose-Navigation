// Generated by Dagger (https://dagger.dev).
package gaur.himanshu.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import gaur.himanshu.ui.AuthFeatureApi;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AuthModule_ProvideAuthFeatureFactory implements Factory<AuthFeatureApi> {
  @Override
  public AuthFeatureApi get() {
    return provideAuthFeature();
  }

  public static AuthModule_ProvideAuthFeatureFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static AuthFeatureApi provideAuthFeature() {
    return Preconditions.checkNotNullFromProvides(AuthModule.INSTANCE.provideAuthFeature());
  }

  private static final class InstanceHolder {
    private static final AuthModule_ProvideAuthFeatureFactory INSTANCE = new AuthModule_ProvideAuthFeatureFactory();
  }
}
