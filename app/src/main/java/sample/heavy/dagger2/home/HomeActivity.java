package sample.heavy.dagger2.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import sample.heavy.dagger2.CarApp;
import sample.heavy.dagger2.R;
import sample.heavy.dagger2.home.di.HomeActivityComponent;

public class HomeActivity extends AppCompatActivity {


    HomeActivityComponent mComponent;

    @Inject
    Fragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mComponent = ((CarApp) (getApplication())).appComponent()
                .homeActivityComponent().build();

        mComponent.inject(this);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_home, mHomeFragment)
                .commit();
    }

    public HomeActivityComponent getComponent() {
        return mComponent;
    }
}
