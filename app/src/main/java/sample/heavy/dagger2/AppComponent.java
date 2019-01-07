package sample.heavy.dagger2;

import javax.inject.Singleton;

import dagger.Component;
import sample.heavy.dagger2.data.CarResource;
import sample.heavy.dagger2.home.di.HomeActivityComponent;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    CarResource getCarResource();

    HomeActivityComponent.Builder homeActivityComponent();

    @Component.Builder
    interface Builder {

        AppComponent build();
    }

}
