package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class OutputView {

    private final static String ROUND_RESULT = "실행결과";
    private final static String RACING_RESULT = "최종 우승자";

    public  void roundResultMessage(){
        System.out.println(ROUND_RESULT);
    }

    public  void printRoundResult(List<Car> cars){
        for(Car car: cars){
            String positionDisplay = "-".repeat(car.getPosition());
            System.out.println(car.getName() + " : " + positionDisplay);
        }
        System.out.println();
    }

    public  void printRaceResult(List<String> winners){
        String result = String.join(",", winners);
        System.out.println(RACING_RESULT + " : " + result);
    }

}
