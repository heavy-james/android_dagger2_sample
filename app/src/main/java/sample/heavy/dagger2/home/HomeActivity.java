package sample.heavy.dagger2.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import sample.heavy.dagger2.CarRepository;
import sample.heavy.dagger2.R;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Fragment fragment = new HomeFragment(new HomePresenter(CarRepository.getInstance()));

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container_home, fragment)
                .commit();
    }
}
