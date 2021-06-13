package hexlet.code.games;

import hexlet.code.Engine;

public final class Calculator {

    private static int operand1;
    private static int operand2;
    private static String operator;
    private static final int NUMBERS_RANDOM_RANGE = 10;
    private static final int OPERATORS_RANDOM_RANGE = 2;
    private static final String GAME_TASK = "What is the result of the expression?";

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        String question = String.format("Question: %s" + " %s" + " %s",
                String.valueOf(operand1), operator, String.valueOf(operand2));
        return question.toString();
    }

    public static String getCorrectAnswer() {
        switch (operator) {
            case "+": return String.valueOf(operand1 + operand2);
            case "-": return String.valueOf(operand1 - operand2);
            case "*": return String.valueOf(operand1 * operand2);
            default: throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    public static void setQuestionData() {
        operand1 = Engine.getRandomNumber(NUMBERS_RANDOM_RANGE);
        operand2 = Engine.getRandomNumber(NUMBERS_RANDOM_RANGE);
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
