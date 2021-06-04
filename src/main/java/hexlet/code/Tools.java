package hexlet.code;

import java.util.Random;

public class Tools {

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int getGCD(int a, int b) {
        if (a == b) {
            return a;
        }
        return (a < b) ? getGCD(a, b - a) : getGCD(b, a - b);
    }

}
