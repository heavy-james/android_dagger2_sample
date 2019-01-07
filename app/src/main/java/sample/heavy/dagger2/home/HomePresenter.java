package sample.heavy.dagger2.home;

import javax.inject.Inject;

import sample.heavy.dagger2.base.IView;
import sample.heavy.dagger2.data.CarResource;

public class HomePresenter implements HomeContract.IHomePresenter {

    private HomeContract.IHomeView mView;

    private CarResource mCarResource;

    @Inject
    public HomePresenter(CarResource carResource) {
        mCarResource = carResource;
    }

    @Override
    public void takeView(IView iView) {
        mView = (HomeContract.IHomeView) iView;
    }

    @Override
    public void dropView() {
        mView = null;
    }

    @Override
    public void start() {
        nextRandomCar();
    }

    @Override
    public void nextRandomCar() {
        mView.showCar(mCarResource.getRandomCar());
    }
}
