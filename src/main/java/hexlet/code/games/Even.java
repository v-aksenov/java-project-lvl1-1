package hexlet.code.games;

import hexlet.code.Tools;

public final class Even {

    private static int randomNumber;
    private static final String GAME_TASK = "Answer 'yes' if number even otherwise answer 'no'.";
    private static final int RANDOM_RANGE = 100;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        setQuestionData();
        return  "Question: " + String.valueOf(randomNumber);
    }

    public static String getCorrectAnswer() {
        boolean isEven = (randomNumber % 2 == 0) ? true : false;
        return isEven ? "yes" : "no";
    }

    private static void setQuestionData() {
        randomNumber = Tools.getRandomNumber(RANDOM_RANGE);
    }
}
