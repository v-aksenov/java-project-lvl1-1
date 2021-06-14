package hexlet.code.games;

import hexlet.code.Engine;

public final class Even {

    private static int randomNumber;
    private static String question;
    private static String correctAnswer;
    private static final String GAME_TASK = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void startGame(String user, int attempt) {
        setQuestionData();
        question = getQuestion();
        correctAnswer = getCorrectAnswer();
        boolean isCorrect = Engine.play(attempt, user, GAME_TASK, question, correctAnswer);
        if (!isCorrect) {
            return;
        } else {
            startGame(user, attempt + 1);
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
