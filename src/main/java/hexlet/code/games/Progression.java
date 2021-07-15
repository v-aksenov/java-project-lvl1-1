package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {

    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final String GAME_TASK = "What number is missing in the progression?";
    private static int progressionLength;
    private static int skippedPosition;
    private static int firstElement;
    private static int progressionStep;
    private static int[] progression;
    private static String[] question = new String[Engine.ATTEMPTS_NUMBER];
    private static String[] correctAnswer = new String[Engine.ATTEMPTS_NUMBER];


    public static void play() {
        for (int i = 0; i < Engine.ATTEMPTS_NUMBER; i++) {
            setQuestionData();
            question[i] = getQuestion();
            correctAnswer[i] = getCorrectAnswer();
        }
        Engine.start(GAME_TASK, question, correctAnswer);
    }

    private static void setQuestionData() {
        progressionLength = Utils.getRandomNumber(MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH;
        skippedPosition = Utils.getRandomNumber(progressionLength);
        firstElement = Utils.getRandomNumber(Engine.RANDOM_RANGE);
        progressionStep = Utils.getRandomNumber(Engine.RANDOM_RANGE);
        progression = getProgression(firstElement, progressionStep);
    }

    private static String getQuestion() {
        String sequence = getSequence();
        return String.format(Engine.QUESTION, sequence);
    }

    private static String getCorrectAnswer() {
        return String.valueOf(progression[skippedPosition]);
    }


    private static int[] getProgression(int first, int step) {
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
