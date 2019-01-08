package sample.heavy.dagger2;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class CarApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().build();
    }
}
