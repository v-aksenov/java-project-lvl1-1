package hexlet.code.games;

import hexlet.code.Tools;

public final class Calculator extends Game {

    private int operand1;
    private int operand2;
    private String operator;
    private static final int NUMBERS_RANDOM_RANGE = 10;
    private static final int OPERATORS_RANDOM_RANGE = 2;
    private static final String GAME_TASK = "What is the result of the expression?";

    @Override
    public String getGameTask() {
        return GAME_TASK;
    }

    @Override
    public void setQuestionData() {
        operand1 = Tools.getRandomNumber(NUMBERS_RANDOM_RANGE);
        operand2 = Tools.getRandomNumber(NUMBERS_RANDOM_RANGE);
        operator = getOperator(OPERATORS_RANDOM_RANGE);
    }

    @Override
    public String getQuestion() {
        StringBuilder question = new StringBuilder();
        question.append("Question: ")
                .append(String.valueOf(operand1))
                .append(" ")
                .append(operator)
                .append(" ")
                .append(String.valueOf(operand2));
        return question.toString();
    }

    @Override
    public String getCorrectAnswer() {
        int mult = operand1 * operand2;
        int sum = operand1 + operand2;
        int diff = operand1 - operand2;
        if (operator.equals("*")) {
            return String.valueOf(mult);
        } else {
            return operator.equals("+") ? String.valueOf(sum) : String.valueOf(diff);
        }
    }

    private String getOperator(int range) {
        int random = Tools.getRandomNumber(OPERATORS_RANDOM_RANGE);
        if (random == 0) {
            return "*";
        } else {
            return random == 1  ? "+" : "-";
        }
    }
}
