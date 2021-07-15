package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calculator {

    private static int operand1;
    private static int operand2;
    private static String operator;
    private static String[] question = new String[Engine.ATTEMPTS_NUMBER];
    private static String[] correctAnswer = new String[Engine.ATTEMPTS_NUMBER];
    private static final int OPERATORS_RANDOM_RANGE = 2;
    private static final String GAME_TASK = "What is the result of the expression?";
    private static final String QUESTION = Engine.QUESTION + "%s %s";

    public static void play() {
        for (int i = 0; i < Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question[i] = getQuestion();
            correctAnswer[i] = getCorrectAnswer();
        }
        Engine.start(GAME_TASK, question, correctAnswer);
    }

    private static void setQuestionData() {
        operand1 = Utils.getRandomNumber(Engine.RANDOM_RANGE);
        operand2 = Utils.getRandomNumber(Engine.RANDOM_RANGE);
        operator = getOperator();
    }

    private static String getQuestion() {
        return String.format(QUESTION, operand1, operator, operand2);
    }

    private static String getCorrectAnswer() {
        switch (operator) {
            case "+": return String.valueOf(operand1 + operand2);
            case "-": return String.valueOf(operand1 - operand2);
            case "*": return String.valueOf(operand1 * operand2);
            default: throw new IllegalArgumentException("Unsupported operator: " + operator);
        }
    }

    private static String getOperator() {
        int random = Utils.getRandomNumber(OPERATORS_RANDOM_RANGE);
        switch (random) {
            case 0: return "*";
            case 1: return "+";
            case 2: return "-";
            default: throw new IllegalArgumentException("Operator selection error: " + random);
        }
    }
}
