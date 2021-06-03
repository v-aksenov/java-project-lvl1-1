package hexlet.code.games;

import hexlet.code.Tools;

public final class Even extends Game {

    private int randomNumber;

    @Override
    public String showGameTask() {
        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    @Override
    public Question getQuestion() {
        randomNumber = Tools.getRandomNumber();
        return new Question(String.valueOf(randomNumber));
    }

    @Override
    public void showQuestion(Question question) {
        System.out.println("Question: " + question.getItem1());
    }

    @Override
    public String getCorrectAnswer() {
        boolean isEven = (randomNumber % 2 == 0) ? true : false;
        return isEven ? "yes" : "no";
    }
}
