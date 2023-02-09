package view.output;

public enum PrintMessages {
    ENTER_CAR_NAMES("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
    ENTER_COUNT("시도할 회수는 몇회인가요?"),
    RESULT("\n실행 결과");
    private final String content;

    PrintMessages(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
