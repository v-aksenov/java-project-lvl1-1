package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {

    private static int randomNumber;
    private static String[] question = new String[Engine.ATTEMPTS_NUMBER];
    private static String[] correctAnswer = new String[Engine.ATTEMPTS_NUMBER];
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void play() {
        for (int i = 0; i < Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question[i] = getQuestion();
            correctAnswer[i] = getCorrectAnswer();
        }
        Engine.start(GAME_TASK, question, correctAnswer);
    }

    private static void setQuestionData() {
        randomNumber = Utils.getRandomNumber(Engine.RANDOM_RANGE);
    }

    private static String getQuestion() {
        return String.format(Engine.QUESTION, randomNumber);
    }

    private static String getCorrectAnswer() {
        return isPrime(randomNumber) ? "yes" : "no";
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
