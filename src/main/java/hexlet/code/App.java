package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");

        Scanner scan = new Scanner(System.in);
        int userChoice = Integer.parseInt(scan.nextLine());

        System.out.println("Your choice: " + userChoice);

        if (userChoice > 0) {
            String user = Cli.greetGameUser();
        }
        if (userChoice == 2) {
            EvenGame.start(user);
        }
    }
}
