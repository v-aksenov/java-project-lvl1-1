package hexlet.code.games;

import hexlet.code.Tools;

public final class GCD {

    private static int number1;
    private static int number2;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_RANGE = 10;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        setQuestionData();
        StringBuilder question = new StringBuilder();
        question.append("Question: ").append(number1).append(" ").append(number2);
        return question.toString();
    }

    public static String getCorrectAnswer() {
        int result = Tools.getGCD(number1, number2);
        return String.valueOf(result);
    }

    private static void setQuestionData() {
        number1 = Tools.getRandomNumber(RANDOM_RANGE);
        number2 = Tools.getRandomNumber(RANDOM_RANGE);
    }
}
