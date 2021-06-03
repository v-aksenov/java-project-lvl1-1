package hexlet.code.games;

public abstract class Game {
    public abstract String showGameTask();
    public abstract Question getQuestion();
    public abstract void showQuestion(Question question);
    public abstract String getCorrectAnswer();
}
