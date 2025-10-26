package racingcar.controller;

import racingcar.exception.InputException;

import java.util.ArrayList;
import java.util.List;



public class CarController {

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

}
