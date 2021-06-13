package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {

    private static int randomNumber;
    private static final String GAME_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int RANDOM_RANGE = 100;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        return  "Question: " + String.valueOf(randomNumber);
    }

    public static String getCorrectAnswer() {
        return isEven(randomNumber) ? "yes" : "no";
    }

    public static void setQuestionData() {
        randomNumber = Engine.getRandomNumber(RANDOM_RANGE);
    }

    private  static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
