package racingcar.exception;

public enum InputException {

    NAME_SIZE_OVER("이름이 5자 초과했습니다."),
    NAME_INCLUDE_SPACE("이름에 공백이 포함되었습니다."),
    NAME_SIZE_ZERO("이름이 0자입니다."),
    NAME_IS_NULL("이름이 비었습니다."),
    ATTEMPT_IS_NULL("시도 횟수가 비었습니다."),
    ATTEMPT_ZERO_OR_MINUS("시도 횟수가 0또는 음수입니다,"),
    ATTEMPT_NUM_DECIMAL("시도 횟수가 소수입니다.");

    private final String message;
    InputException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
