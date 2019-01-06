package sample.heavy.dagger2;

import java.util.UUID;

import sample.heavy.dagger2.data.Car;
import sample.heavy.dagger2.data.CarResource;
import sample.heavy.dagger2.data.Engine;

public class CarRepository implements CarResource {

    private static volatile CarRepository mInstance;

    private CarRepository() {

    }

    public static CarRepository getInstance() {
        if (mInstance == null) {
            synchronized (CarRepository.class) {
                if (mInstance == null) {
                    return new CarRepository();
                }
            }
        }
        return mInstance;
    }

    @Override
    public Car getRandomCar() {
        String name = UUID.randomUUID().toString().substring(0, 4);
        int cylinders = (int) (Math.random() * 10);
        Car car = new Car(new Engine(cylinders));
        car.setName(name);
        return car;
    }
}
