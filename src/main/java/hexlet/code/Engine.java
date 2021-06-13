package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {

    private static final int ATTEMPTS_NUMBER = 3;
    private static final String YOUR_ANSWER = "Your answer: ";
    private static final String CORRECT = "Correct!";
    private static final String CONGRATS = "Congratulations, ";
    private static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";
    private static final String TRY_AGAIN = "Let's try again, ";

    public static void startGame(String user, int gameNumber) {

        System.out.println(Game.getGameTask(gameNumber));

        for (int i = 1; i <= ATTEMPTS_NUMBER; i++) {
            Game.setQuestionData(gameNumber);
            String question = Game.getQuestion(gameNumber);
            System.out.println(question);
            String correctAnswer = Game.getCorrectAnswer(gameNumber);
            String userAnswer = getUserAnswer();
            System.out.println(YOUR_ANSWER + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                showPositiveResult(i, user);
            } else {
                showNegativeResult(userAnswer, correctAnswer, user);
                i = ATTEMPTS_NUMBER + 1;
            }
        }
    }

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    private static String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return  scan.nextLine();
    }

    private static void showPositiveResult(int attempt, String user) {
        System.out.println(CORRECT);
        if (attempt == ATTEMPTS_NUMBER) {
            System.out.println(CONGRATS + user + "!");
        }
    }

    private static void showNegativeResult(String userAnswer, String correctAnswer, String user) {
        String result = String.format("'%s" + "'%s" + "'%s" + "'.", userAnswer, WRONG_ANSWER, correctAnswer);
        System.out.println(result);
        System.out.println(TRY_AGAIN + user + "!");
    }


}
