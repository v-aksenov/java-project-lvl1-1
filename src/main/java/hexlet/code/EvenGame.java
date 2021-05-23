package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    private static final int ATTEMPTS_NUMBER = 3;

    public static void start(String user) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 1; i <= ATTEMPTS_NUMBER; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(100);
            System.out.println("Question: " + randomNumber);

            boolean isEven = (randomNumber % 2 == 0) ? true : false;

            String correctAnswer = isEven ? "yes" : "no";

            Scanner scan = new Scanner(System.in);
            String userAnswer = scan.nextLine();

            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
                if (i == ATTEMPTS_NUMBER) {
                    System.out.println("Congratulations, " + user + "!");
                }
            } else {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + user + "!");
                i = ATTEMPTS_NUMBER + 1;
            }
        }
    }
}