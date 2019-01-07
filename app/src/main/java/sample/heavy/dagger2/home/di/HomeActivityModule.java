package sample.heavy.dagger2.home.di;

import android.support.v4.app.Fragment;

import dagger.Binds;
import dagger.Module;
import sample.heavy.dagger2.home.HomeContract;
import sample.heavy.dagger2.home.HomeFragment;
import sample.heavy.dagger2.home.HomePresenter;

@Module(subcomponents = HomeFragmentComponent.class)
public interface HomeActivityModule {

    @Binds
    Fragment provideHomeFragment(HomeFragment fragment);

    @Binds
    HomeContract.IHomePresenter providePresenter(HomePresenter homePresenter);

}
