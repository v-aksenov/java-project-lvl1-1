package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime {

    private static int randomNumber;
    private static String question;
    private static String correctAnswer;
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";


    public static void play(String user, int attempt) {
        setQuestionData();
        question = getQuestion();
        correctAnswer = getCorrectAnswer();
        boolean isUserAnswerCorrect = Engine.start(attempt, user, GAME_TASK, question, correctAnswer);
        if (isUserAnswerCorrect) {
            play(user, attempt + 1);
        } else {
            return;
        }
    }

    private static String getQuestion() {
        return  "Question: " + String.valueOf(randomNumber);
    }

    private static String getCorrectAnswer() {
        return isPrime(randomNumber) ? "yes" : "no";
    }

    private static void setQuestionData() {
        randomNumber = Engine.getRandomNumber(Engine.RANDOM_RANGE);
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
