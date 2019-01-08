package sample.heavy.dagger2.home;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import sample.heavy.dagger2.di.FragmentScoped;

@Module
public interface HomeActivityModule {

    @FragmentScoped
    @ContributesAndroidInjector
    HomeFragment provideHomeFragment();

    @Binds
    HomeContract.IHomePresenter providePresenter(HomePresenter homePresenter);

}
