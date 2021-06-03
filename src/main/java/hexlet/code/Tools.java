package hexlet.code;

import java.util.Random;

public class Tools {

    private static final int NUMBERS_RANDOM_RANGE = 100;
    private static final int OPERATORS_RANDOM_RANGE = 2;

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(NUMBERS_RANDOM_RANGE);
    }

    public static String getOperator() {
        int random = new Random().nextInt(OPERATORS_RANDOM_RANGE);
        if (random == 0) {
            return "*";
        } else {
            return random == 1  ? "+" : "-";
        }
    }
}
