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

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
