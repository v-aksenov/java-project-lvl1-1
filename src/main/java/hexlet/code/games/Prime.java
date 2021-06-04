package hexlet.code.games;

import hexlet.code.Tools;

public final class Prime implements IGame {

    private int randomNumber;
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANDOM_RANGE = 100;

    public String getGameTask() {
        return GAME_TASK;
    }

    public void setQuestionData() {
        randomNumber = Tools.getRandomNumber(RANDOM_RANGE);
    }

    public String getQuestion() {
        return  "Question: " + String.valueOf(randomNumber);
    }

    public String getCorrectAnswer() {
        return Tools.isPrime(randomNumber) ? "yes" : "no";
    }
}
