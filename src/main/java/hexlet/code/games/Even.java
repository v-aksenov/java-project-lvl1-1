package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {

    private static int randomNumber;
    private static String question;
    private static String correctAnswer;
    private static final String GAME_TASK = "Answer 'yes' if number even otherwise answer 'no'.";

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
        return  "Question: " + String.valueOf(randomNumber);
    }

    private static String getCorrectAnswer() {
        return isEven(randomNumber) ? "yes" : "no";
    }

    private static void setQuestionData() {
        randomNumber = Engine.getRandomNumber(Engine.RANDOM_RANGE);
    }

    private  static boolean isEven(int number) {
        return (number % 2 == 0) ? true : false;
    }
}
