package sample.heavy.dagger2.data;

public class Fuel {

    int mEnergy;


    public void burn(int energy) {
        mEnergy -= energy;
    }

}
