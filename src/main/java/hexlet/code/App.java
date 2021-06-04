package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Game;
import hexlet.code.games.GameSelector;

public class App {
    private static final int GAME_POINTER = 2;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");

        Scanner scan = new Scanner(System.in);
        int userChoice = Integer.parseInt(scan.nextLine());

        System.out.println("Your choice: " + userChoice);

        if (userChoice > 0) {
            String user = Cli.getUserName();
            System.out.println("Hello, " + user + "!");
            if (userChoice > 1) {
                Game game = selectGame(userChoice);
                Engine.startGame(user, game);
            }
        }
    }

    private static Game selectGame(int gameNumber) {
        return GameSelector.values()[gameNumber - GAME_POINTER].select();
    }
}
