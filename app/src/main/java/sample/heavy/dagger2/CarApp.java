package sample.heavy.dagger2;

import android.app.Application;

public class CarApp extends Application {

    AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().build();
    }

    public AppComponent appComponent() {
        return mAppComponent;
    }
}
