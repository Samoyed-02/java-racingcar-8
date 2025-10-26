package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

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

    public void raceOneRound(){
        for(Car car : this.getAllCars()){
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            car.move(randomNumber);
        }
    }

    public List<String> getWinners(){

        int maxPosition = findMaxPosition();
        List<String> winners = new ArrayList<>();

        for(Car car : this.cars){
            if(car.getPosition() == maxPosition){
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private int findMaxPosition(){

        int maxPosition = 0;

        for(Car  car: this.cars){
            if(car.getPosition() > maxPosition){
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }

}
