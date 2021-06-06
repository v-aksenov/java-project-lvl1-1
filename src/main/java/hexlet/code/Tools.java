package hexlet.code;

import java.util.Random;

public class Tools {

    public static int getRandomNumber(int range) {
        return new Random().nextInt(range);
    }

    public static int getGCD(int p, int q) {
        if (q == 0) {
            return p;
        }
        return getGCD(q, p % q);
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
