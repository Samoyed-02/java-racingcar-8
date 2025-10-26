package racingcar.view;


import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private final static String INPUT_CARS_MESSAGE ="경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private final static String INPUT_ATTEMPT_MESSAGE ="시도할 횟수는 몇 회인가요?";

    public String inputCarsName(){
        System.out.println(INPUT_CARS_MESSAGE);
        return Console.readLine();
    }

    public String inputAttemptRead(){
        System.out.println(INPUT_ATTEMPT_MESSAGE);
        return Console.readLine();
    }

}
