package racingcar;

import racingcar.controller.CarController;
import racingcar.service.CarRacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CarRacingService carRacingService = new CarRacingService(outputView);
        CarController carController = new CarController(inputView,carRacingService);
        carController.preparationRace();
    }
}
