package hexlet.code.games;

import hexlet.code.Tools;

public final class GCD extends Game {

    private int number1;
    private int number2;

    @Override
    public String showGameTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public Question getQuestion() {
        number1 = Tools.getRandomNumber();
        number2 = Tools.getRandomNumber();
        return new Question(String.valueOf(number1), String.valueOf(number2));
    }

    @Override
    public void showQuestion(Question quest) {
        StringBuilder question = new StringBuilder();
        question.append("Question: ").append(quest.getItem1()).append(" ").append(quest.getItem2());
        System.out.println(question);
    }

    @Override
    public String getCorrectAnswer() {
        int result = Tools.getGCD(number1, number2);
        return String.valueOf(result);
    }
}
