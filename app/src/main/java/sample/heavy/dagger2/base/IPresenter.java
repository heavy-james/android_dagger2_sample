package sample.heavy.dagger2.base;

public interface IPresenter {

    void takeView(IView baseView);

    void dropView();
}
