package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {

    public static final int ATTEMPTS_NUMBER = 3;
    public static final int RANDOM_RANGE = 10;
    public static final String QUESTION = "Question: %s ";
    private static final String YOUR_ANSWER = "Your answer: ";
    private static final String CORRECT = "Correct!";
    private static final String CONGRATS = "Congratulations, %s!";
    private static final String WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'";
    private static final String TRY_AGAIN = "Let's try again, %s!";

    public static boolean start(int attempt, String user, String gameTask, String question, String correctAnswer) {
        if (attempt == 1) {
            showUserMessage(gameTask);
        }
        showUserMessage(question);
        String userAnswer = getUserAnswer();
        showUserMessage(YOUR_ANSWER + userAnswer);
        if (userAnswer.equals(correctAnswer)) {
            String positiveResult = getPositiveResult(attempt, user);
            showUserMessage(positiveResult);
            return (attempt < ATTEMPTS_NUMBER) ? true : false;
        } else {
            String negativeResult = getNegativeResult(userAnswer, correctAnswer, user);
            showUserMessage(negativeResult);
            return false;
        }
    }

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    private static String getUserAnswer() {
        Scanner scan = new Scanner(System.in);
        return  scan.nextLine();
    }

    private static String getPositiveResult(int attempt, String user) {
        String positiveResult = String.format(CONGRATS, user);
        return (attempt == ATTEMPTS_NUMBER) ? String.format("%s\n%s", CORRECT, positiveResult) : CORRECT;
    }

    private static String getNegativeResult(String userAnswer, String correctAnswer, String user) {
        String wrongAnswer = String.format(WRONG_ANSWER, userAnswer, correctAnswer);
        String goodbye = String.format(TRY_AGAIN, user);
        String negativeResult = String.format("%s\n%s", wrongAnswer, goodbye);
        return negativeResult;
    }

    private static void showUserMessage(String userMessage) {
        System.out.println(userMessage);
    }

}
