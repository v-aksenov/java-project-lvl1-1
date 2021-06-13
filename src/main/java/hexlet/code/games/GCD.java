package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD {

    private static int number1;
    private static int number2;
    private static String question;
    private static String correctAnswer;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";


    public static void startGame(String user) {
        for (int i = 1; i <= Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question = getQuestion();
            correctAnswer = getCorrectAnswer();
            boolean isCorrect = Engine.play(i, user, GAME_TASK, question, correctAnswer);
            if (!isCorrect) {
                return;
            }
        }
    }

    private static String getQuestion() {
        String quest = String.format("Question: %s" + " %s", String.valueOf(number1), String.valueOf(number2));
        return quest;
    }

    private static String getCorrectAnswer() {
        int result = getGCD(number1, number2);
        return String.valueOf(result);
    }

    private static void setQuestionData() {
        number1 = Engine.getRandomNumber(Engine.RANDOM_RANGE);
        number2 = Engine.getRandomNumber(Engine.RANDOM_RANGE);
    }

    private static int getGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return getGCD(q, p % q);
    }
}
