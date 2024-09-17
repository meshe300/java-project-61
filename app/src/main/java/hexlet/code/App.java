package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        var numberGame = scan.next();
        System.out.println("Your choice: " + numberGame);
        if (numberGame.equals("1")) {
            Cli.startProgramm();
        } else if (numberGame.equals("2")) {
            Even.even();

        }
    }
}
