package gaur.himanshu.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lgaur/himanshu/di/AuthModule;", "", "()V", "provideAuthFeature", "Lgaur/himanshu/ui/AuthFeatureApi;", "ui_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AuthModule {
    @org.jetbrains.annotations.NotNull
    public static final gaur.himanshu.di.AuthModule INSTANCE = null;
    
    private AuthModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final gaur.himanshu.ui.AuthFeatureApi provideAuthFeature() {
        return null;
    }
}