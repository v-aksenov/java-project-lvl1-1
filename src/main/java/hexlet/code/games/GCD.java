package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD {

    private static int number1;
    private static int number2;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_RANGE = 10;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        String question = String.format("Question: %s" + " %s",
                String.valueOf(number1), String.valueOf(number2));
        return question;
    }

    public static String getCorrectAnswer() {
        int result = getGCD(number1, number2);
        return String.valueOf(result);
    }

    public static void setQuestionData() {
        number1 = Engine.getRandomNumber(RANDOM_RANGE);
        number2 = Engine.getRandomNumber(RANDOM_RANGE);
    }

    private static int getGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return getGCD(q, p % q);
    }
}
