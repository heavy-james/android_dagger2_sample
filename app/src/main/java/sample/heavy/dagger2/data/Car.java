package sample.heavy.dagger2.data;


public class Car {

    String mName;

    Engine mEngine;

    public Car(Engine engine) {
        mEngine = engine;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public Engine getEngine() {
        return mEngine;
    }

}
