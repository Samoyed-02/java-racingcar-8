package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> carsName) {
        this.cars = new ArrayList<>();

        for(String name : carsName){
            this.cars.add(new Car(name));
        }
    }

    public List<Car> getAllCars(){
        return Collections.unmodifiableList(cars);
    }

}
