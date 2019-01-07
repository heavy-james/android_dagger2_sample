package sample.heavy.dagger2;

import dagger.Binds;
import dagger.Module;
import sample.heavy.dagger2.data.CarResource;
import sample.heavy.dagger2.home.di.HomeActivityComponent;

@Module(subcomponents = HomeActivityComponent.class)
public abstract class AppModule {

    @Binds
    abstract CarResource carResource(CarRepository carRepository);

}
