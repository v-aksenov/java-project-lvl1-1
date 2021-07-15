package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ATTEMPTS_NUMBER = 3;
    public static final int RANDOM_RANGE = 10;
    public static final String QUESTION = "Question: %s ";
    private static final String YOUR_ANSWER = "Your answer: ";
    private static final String CORRECT = "Correct!";
    private static final String CONGRATS = "Congratulations, %s!";
    private static final String WRONG_ANSWER = "'%s' is wrong answer ;(. Correct answer was '%s'";
    private static final String TRY_AGAIN = "Let's try again, %s!";
    private static final String WELCOME = "Welcome to the Brain Games!";
    private static final String YOUR_NAME = "May I have your name? ";

    public static void start(String gameTask, String[] question, String[] correctAnswer) {
        showUserMessage(WELCOME);
        showUserMessage(YOUR_NAME);
        String user = getUserName();
        Cli.greetUser(user);

        if (!gameTask.equals("Greet")) {
            for (int i = 0; i < ATTEMPTS_NUMBER; i++) {
                if (i == 0) {
                    showUserMessage(gameTask);
                }
                showUserMessage(question[i]);
                String userAnswer = getUserAnswer();
                showUserMessage(YOUR_ANSWER + userAnswer);

                if (userAnswer.equals(correctAnswer[i])) {
                    String positiveResult = getPositiveResult(i + 1, user);
                    showUserMessage(positiveResult);
                } else {
                    String negativeResult = getNegativeResult(userAnswer, correctAnswer[i], user);
                    showUserMessage(negativeResult);
                    i = ATTEMPTS_NUMBER;
                }
            }
        }
    }

    private static String getUserName() {
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        return userName;
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
