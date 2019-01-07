package sample.heavy.dagger2.home.di;

import dagger.Subcomponent;
import sample.heavy.dagger2.home.HomeFragment;

@Subcomponent
public interface HomeFragmentComponent {

    void inject(HomeFragment homeFragment);

    @Subcomponent.Builder
    interface Builder {

        HomeFragmentComponent build();
    }
}
