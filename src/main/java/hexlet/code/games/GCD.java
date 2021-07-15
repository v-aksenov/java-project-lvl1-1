package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD {

    private static int number1;
    private static int number2;
    private static String[] question = new String[Engine.ATTEMPTS_NUMBER];
    private static String[] correctAnswer = new String[Engine.ATTEMPTS_NUMBER];
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final String QUESTION = Engine.QUESTION + "%s";


    public static void play() {
        for (int i = 0; i < Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question[i] = getQuestion();
            correctAnswer[i] = getCorrectAnswer();
        }
        Engine.start(GAME_TASK, question, correctAnswer);
    }

    private static void setQuestionData() {
        number1 = Utils.getRandomNumber(Engine.RANDOM_RANGE);
        number2 = Utils.getRandomNumber(Engine.RANDOM_RANGE);
    }

    private static String getQuestion() {
        return String.format(QUESTION, number1, number2);
    }

    private static String getCorrectAnswer() {
        int result = getGCD(number1, number2);
        return String.valueOf(result);
    }


    private static int getGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return getGCD(q, p % q);
    }
}
