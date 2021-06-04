package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.IGame;

public class Engine {

    private static final int ATTEMPTS_NUMBER = 3;

    public static void startGame(String user, IGame game) {

        System.out.println(game.getGameTask());

        for (int i = 1; i <= ATTEMPTS_NUMBER; i++) {
            game.setQuestionData();
            String question = game.getQuestion();
            System.out.println(question);
            String correctAnswer = game.getCorrectAnswer();
            String userAnswer = getUserAnswer();
            System.out.println("Your answer: " + userAnswer);
            if (userAnswer.equals(correctAnswer)) {
                showPositiveResult(i, user);
            } else {
                showNegativeResult(userAnswer, correctAnswer, user);
                i = ATTEMPTS_NUMBER + 1;
            }
        }
    }

    private static String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return  scan.nextLine();
    }

    private static void showPositiveResult(int attempt, String user) {
        System.out.println("Correct!");
        if (attempt == ATTEMPTS_NUMBER) {
            System.out.println("Congratulations, " + user + "!");
        }
    }

    private static void showNegativeResult(String userAnswer, String correctAnswer, String user) {
        StringBuilder result = new StringBuilder();
        result.append("'")
                .append(userAnswer)
                .append("'")
                .append(" is wrong answer ;(. Correct answer was ")
                .append("'")
                .append(correctAnswer)
                .append("'.");
        System.out.println(result);
        System.out.println("Let's try again, " + user + "!");
    }
}
