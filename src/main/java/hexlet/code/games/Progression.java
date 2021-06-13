package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final String GAME_TASK = "What number is missing in the progression?";
    private static final int RANDOM_RANGE = 10;
    private static int progressionLength;
    private static int skippedPosition;
    private static int firstElement;
    private static int progressionStep;
    private static int[] progression;

    public static String getGameTask() {
        return GAME_TASK;
    }

    public static String getQuestion() {
        String sequence = getSequence();
        return "Question: " + sequence;
    }

    public static String getCorrectAnswer() {
        return String.valueOf(progression[skippedPosition]);
    }

    public static void setQuestionData() {
        progressionLength = Engine.getRandomNumber(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        skippedPosition = Engine.getRandomNumber(progressionLength);
        firstElement = Engine.getRandomNumber(RANDOM_RANGE);
        progressionStep = Engine.getRandomNumber(RANDOM_RANGE);
        progression = getProgression(progressionLength, firstElement, progressionStep);
    }

    private static int[] getProgression(int length, int first, int step) {
        int[] sequence = new int[progressionLength];
        sequence[0] = first;
        for (int i = 1; i < progressionLength; i++) {
            sequence[i] = sequence[i - 1] + step;
        }
        return sequence;
    }

    private static String getSequence() {
        StringBuilder sequence = new StringBuilder();
        String symbol = "";
        for (int i = 0; i < progressionLength; i++) {
            symbol = (i == skippedPosition) ? ".." : String.valueOf(progression[i]);
            sequence.append(symbol).append(" ");
        }
        return sequence.toString();
    }
}
