package constructor;

import java.util.Arrays;

/**
 * Created by Michał Szewczyk on 2017-02-15.
 */
public class Car {
    private Passenger[] passengers;
    private Engine engine;
    private Wheels wheels;

    public Car(Engine engine, Wheels wheels, Passenger... passengers) {
        this.passengers = passengers;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "passengers=" + Arrays.toString(passengers) +
                ", engine=" + engine +
                ", wheels=" + wheels +
                '}';
    }
}
