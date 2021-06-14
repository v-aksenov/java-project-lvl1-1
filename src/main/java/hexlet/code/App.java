package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calculator;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class App {

    private static final int EVEN = 2;
    private static final int CALCULATOR = 3;
    private static final int GREAT_CD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    private static final int FIRST_ATTEMPT = 1;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scan = new Scanner(System.in);
        int userChoice = Integer.parseInt(scan.nextLine());

        System.out.println("Your choice: " + userChoice);

        if (userChoice > 0) {
            String user = Cli.getUserName();
            System.out.println("Hello, " + user + "!");
            if (userChoice > 1) {
                switch (userChoice) {
                    case EVEN:
                        Even.startGame(user, FIRST_ATTEMPT);
                        break;
                    case CALCULATOR:
                        Calculator.startGame(user, FIRST_ATTEMPT);
                        break;
                    case GREAT_CD:
                        GCD.startGame(user, FIRST_ATTEMPT);
                        break;
                    case PROGRESSION:
                        Progression.startGame(user, FIRST_ATTEMPT);
                        break;
                    case PRIME:
                        Prime.startGame(user, FIRST_ATTEMPT);
                        break;
                    default: throw new IllegalArgumentException("Unsupported game id#" + userChoice);
                }
            }
        }
    }
}
