package hexlet.code.games;

import hexlet.code.Tools;

public final class GCD implements IGame {

    private int number1;
    private int number2;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_RANGE = 10;

    public String getGameTask() {
        return GAME_TASK;
    }

    public void setQuestionData() {
        number1 = Tools.getRandomNumber(RANDOM_RANGE);
        number2 = Tools.getRandomNumber(RANDOM_RANGE);
    }

    public String getQuestion() {
        StringBuilder question = new StringBuilder();
        question.append("Question: ").append(number1).append(" ").append(number2);
        return question.toString();
    }

    public String getCorrectAnswer() {
        int result = Tools.getGCD(number1, number2);
        return String.valueOf(result);
    }
}
