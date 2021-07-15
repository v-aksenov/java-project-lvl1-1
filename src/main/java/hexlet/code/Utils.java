package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }
}
