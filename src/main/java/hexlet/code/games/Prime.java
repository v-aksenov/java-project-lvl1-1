package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {

    private static int randomNumber;
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANDOM_RANGE = 100;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        return  "Question: " + String.valueOf(randomNumber);
    }

    public static String getCorrectAnswer() {
        return isPrime(randomNumber) ? "yes" : "no";
    }

    public static void setQuestionData() {
        randomNumber = Engine.getRandomNumber(RANDOM_RANGE);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
