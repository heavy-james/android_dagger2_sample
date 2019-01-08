package sample.heavy.dagger2.home;

import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;
import sample.heavy.dagger2.R;

public class HomeActivity extends DaggerAppCompatActivity {

    @Inject
    HomeFragment mHomeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_home, mHomeFragment)
                .commit();
    }
}
