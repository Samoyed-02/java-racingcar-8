package racingcar.service;


import racingcar.domain.Cars;
import racingcar.view.OutputView;

import java.util.List;

public class CarRacingService {

    private final OutputView outputView;

    public CarRacingService(OutputView outputView) {
        this.outputView = outputView;
    }

    public void playRace(List<String> carsName, int attemptNum) {

        Cars cars = new Cars(carsName);

        outputView.roundResultMessage();
        for(int i = 0; i < attemptNum; i++){
            cars.raceOneRound();
            outputView.printRoundResult(cars.getAllCars());
        }

        List<String> winners = cars.getWinners();
        outputView.printRaceResult(winners);
    }

}

