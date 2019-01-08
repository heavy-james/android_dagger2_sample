package sample.heavy.dagger2;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import sample.heavy.dagger2.data.CarResource;
import sample.heavy.dagger2.di.ActivityScoped;
import sample.heavy.dagger2.home.HomeActivity;
import sample.heavy.dagger2.home.HomeActivityModule;

@Module
public abstract class AppModule {
    @Binds
    abstract CarResource carResource(CarRepository carRepository);

    @ActivityScoped
    @ContributesAndroidInjector(modules = HomeActivityModule.class)
    abstract HomeActivity homeActivity();
}
