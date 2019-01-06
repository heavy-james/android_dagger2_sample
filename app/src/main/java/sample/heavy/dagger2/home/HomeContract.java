package sample.heavy.dagger2.home;

import sample.heavy.dagger2.base.IPresenter;
import sample.heavy.dagger2.base.IView;
import sample.heavy.dagger2.data.Car;

public interface HomeContract {

    interface IHomeView extends IView {

        void showCar(Car car);

    }


    interface IHomePresenter extends IPresenter {

        void start();

        void nextRandomCar();

    }
}
