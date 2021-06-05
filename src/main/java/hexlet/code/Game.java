package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Game {

    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GREAT_CD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;

    public static String getGameTask(int gameNumber) {
        switch (gameNumber) {
            case EVEN: return Even.getGameTask();
            case CALCULATOR: return Calculator.getGameTask();
            case GREAT_CD: return GCD.getGameTask();
            case PROGRESSION: return Progression.getGameTask();
            case PRIME: return Prime.getGameTask();
            default: throw new IllegalArgumentException("getGameTask: Unsupported game id#" + gameNumber);
        }
    }

    public static String getQuestion(int gameNumber) {
        switch (gameNumber) {
            case EVEN: return Even.getQuestion();
            case CALCULATOR: return Calculator.getQuestion();
            case GREAT_CD: return GCD.getQuestion();
            case PROGRESSION: return Progression.getQuestion();
            case PRIME: return Prime.getQuestion();
            default: throw new IllegalArgumentException("Unsupported game id#" + gameNumber);
        }
    }

    public static String getCorrectAnswer(int gameNumber) {
        switch (gameNumber) {
            case EVEN: return Even.getCorrectAnswer();
            case CALCULATOR: return Calculator.getCorrectAnswer();
            case GREAT_CD: return GCD.getCorrectAnswer();
            case PROGRESSION: return Progression.getCorrectAnswer();
            case PRIME: return Prime.getCorrectAnswer();
            default: throw new IllegalArgumentException("Unsupported game id#" + gameNumber);
        }
    }
}
