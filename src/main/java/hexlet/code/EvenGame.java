package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    private static final int ATTEMPTS_NUMBER = 3;
    private static final int RANDOM_RANGE = 100;

    public static void startGame(String user) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; i <= ATTEMPTS_NUMBER; i++) {
            int randomNumber = getRandomNumber();
            System.out.println("Question: " + randomNumber);
            String correctAnswer = getCorrectAnswer(randomNumber);
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

    private static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_RANGE);
    }

    private static String getCorrectAnswer(int number) {
        boolean isEven = (number % 2 == 0) ? true : false;
        return isEven ? "yes" : "no";
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
        System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
        System.out.println("Let's try again, " + user + "!");
    }
}
