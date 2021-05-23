package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class EvenGame {
    public static void start(user) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.print("Question: " + randomNumber);

        boolean isEven = (randomNumber % 2 == 0) ? true : false;

        String correctAnswer = isEven ? "yes" : "no";

        Scanner scan = new Scanner(System.in);
        String userAnswer = scan.nextLine();

        System.out.println("Your answer: " + userAnswer);

        if (userAnswer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + user);
        }

    }
}