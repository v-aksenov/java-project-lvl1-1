package hexlet.code.games;

import hexlet.code.Tools;

public final class Progression extends Game {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final String GAME_TASK = "What number is missing in the progression?";
    private static final int RANDOM_RANGE = 10;
    private int progressionLength;
    private int skippedPosition;
    private int firstElement;
    private int progressionStep;
    private int[] progression;


    @Override
    public String getGameTask() {
        return GAME_TASK;
    }

    @Override
    public void setQuestionData() {
        progressionLength = Tools.getRandomNumber(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        skippedPosition = Tools.getRandomNumber(progressionLength);
        firstElement = Tools.getRandomNumber(RANDOM_RANGE);
        progressionStep = Tools.getRandomNumber(RANDOM_RANGE);
        progression = getProgression(progressionLength, firstElement, progressionStep);
    }

    @Override
    public String getQuestion() {
        StringBuilder question = new StringBuilder();
        question.append("Question: ");
        String symbol = "";
        for (int i = 0; i < progressionLength; i++) {
            symbol = (i == skippedPosition) ? ".." : String.valueOf(progression[i]);
            question.append(symbol).append(" ");
        }
        return question.toString();
    }

    @Override
    public String getCorrectAnswer() {
        return String.valueOf(progression[skippedPosition]);
    }

    private int[] getProgression(int length, int first, int step) {
        int[] sequence = new int[progressionLength];
        sequence[0] = first;
        for (int i = 1; i < progressionLength; i++) {
            sequence[i] = sequence[i - 1] + step;
        }
        return sequence;
    }
}
