package hexlet.code.games;

import hexlet.code.Engine;

public final class Calculator {

    private static int operand1;
    private static int operand2;
    private static String operator;
    private static String question;
    private static String correctAnswer;
    private static final int OPERATORS_RANDOM_RANGE = 2;
    private static final String GAME_TASK = "What is the result of the expression?";

    public static void startGame(String user, int attempt) {
        setQuestionData();
        question = getQuestion();
        correctAnswer = getCorrectAnswer();
        boolean isUserAnswerCorrect = Engine.play(attempt, user, GAME_TASK, question, correctAnswer);
        if (isUserAnswerCorrect) {
            startGame(user, attempt + 1);
        } else {
            return;
        }
    }

    private static String getQuestion() {
        String quest = String.format("Question: %s" + " %s" + " %s",
                String.valueOf(operand1), operator, String.valueOf(operand2));
        return quest;
    }

    private static String getCorrectAnswer() {
        switch (operator) {
            case "+": return String.valueOf(operand1 + operand2);
            case "-": return String.valueOf(operand1 - operand2);
            case "*": return String.valueOf(operand1 * operand2);
            default: throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static void setQuestionData() {
        operand1 = Engine.getRandomNumber(Engine.RANDOM_RANGE);
        operand2 = Engine.getRandomNumber(Engine.RANDOM_RANGE);
        operator = getOperator(OPERATORS_RANDOM_RANGE);
    }

    private static String getOperator(int range) {
        int random = Engine.getRandomNumber(OPERATORS_RANDOM_RANGE);
        switch (random) {
            case 0: return "*";
            case 1: return "+";
            case 2: return "-";
            default: throw new IllegalArgumentException("Operator selection error: " + random);
        }
    }
}
