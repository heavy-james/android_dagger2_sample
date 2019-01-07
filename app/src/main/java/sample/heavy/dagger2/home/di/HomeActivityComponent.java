package sample.heavy.dagger2.home.di;

import dagger.Subcomponent;
import sample.heavy.dagger2.home.HomeActivity;

@Subcomponent(modules = HomeActivityModule.class)
public interface HomeActivityComponent {

    void inject(HomeActivity activity);

    HomeFragmentComponent.Builder homeFragmentComponent();

    @Subcomponent.Builder
    interface Builder {
        HomeActivityComponent build();
    }
}
