package hexlet.code.games;

import hexlet.code.Tools;

public final class GCD extends Game {

    private int number1;
    private int number2;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_RANGE = 10;

    @Override
    public String getGameTask() {
        return GAME_TASK;
    }

    @Override
    public void setQuestionData() {
        number1 = Tools.getRandomNumber(RANDOM_RANGE);
        number2 = Tools.getRandomNumber(RANDOM_RANGE);
    }

    @Override
    public String getQuestion() {
        StringBuilder question = new StringBuilder();
        question.append("Question: ").append(number1).append(" ").append(number2);
        return question.toString();
    }

    @Override
    public String getCorrectAnswer() {
        int result = Tools.getGCD(number1, number2);
        return String.valueOf(result);
    }
}
