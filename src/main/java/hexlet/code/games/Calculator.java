package hexlet.code.games;

import hexlet.code.Tools;

public final class Calculator extends Game {

    private int operand1;
    private int operand2;
    private String operator;

    @Override
    public String showGameTask() {
        return "What is the result of the expression?";
    }

    @Override
    public Question getQuestion() {
        operand1 = Tools.getRandomNumber();
        operand2 = Tools.getRandomNumber();
        operator = Tools.getOperator();
        return new Question(String.valueOf(operand1), operator, String.valueOf(operand2));
    }

    @Override
    public void showQuestion(Question quest) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ")
                .append(quest.getItem1())
                .append(" ")
                .append(quest.getItem2())
                .append(" ")
                .append(quest.getItem3());
        System.out.println(question);
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
}
