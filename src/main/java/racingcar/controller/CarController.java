package racingcar.controller;

import racingcar.exception.InputException;
import racingcar.service.CarRacingService;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;



public class CarController {

     private final InputView inputView;
     private final CarRacingService carRacingService;

     public CarController(InputView inputView, CarRacingService carRacingService) {
         this.inputView = inputView;
         this.carRacingService = carRacingService;
     }

     public void preparationRace(){
         String inputCarsName = inputView.inputCarsName();
         List<String> carsName  = validateRoster(inputCarsName);

         String inputAttemptRead = inputView.inputAttemptRead();
         int attemptNum = validateAttempt(inputAttemptRead);

         carRacingService.playRace(carsName, attemptNum);
     }

     private List<String> validateRoster(String inputView){
         String[] splitName = inputView.split(",");
         List<String> validateName = new ArrayList<>();

         for(String name : splitName){
             String trimName = name.trim();
             validateSingleName(trimName);
             validateName.add(trimName);
         }
         return validateName;
     }

     private void validateSingleName(String trimName){
         if(trimName.isEmpty()){
             throw new IllegalArgumentException(InputException.NAME_IS_NULL.getMessage());
         }
         if(trimName.length()>5){
             throw new IllegalArgumentException(InputException.NAME_SIZE_OVER.getMessage());
         }
         if(trimName.contains(" ")){
             throw new IllegalArgumentException(InputException.NAME_SIZE_ZERO.getMessage());
         }
         if(trimName.isBlank()){
             throw new IllegalArgumentException(InputException.NAME_INCLUDE_SPACE.getMessage());
         }
     }

     private int validateAttempt(String inputView){

         if(inputView.isEmpty()){
             throw new IllegalArgumentException(InputException.ATTEMPT_IS_NULL.getMessage());
         }
         if(Integer.parseInt(inputView) <= 0){
             throw new IllegalArgumentException(InputException.ATTEMPT_ZERO_OR_MINUS.getMessage());
         }
         if(inputView.contains(".")){
             throw new IllegalArgumentException(InputException.ATTEMPT_NUM_DECIMAL.getMessage());
         }
         return Integer.parseInt(inputView);
     }



}
