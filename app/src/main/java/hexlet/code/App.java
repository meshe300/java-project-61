package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("0 - Exit");
        var numberGame = scan.next();
        System.out.println("Your choice: " + numberGame);
        if (numberGame.equals("1")) {
            Cli.startGame();
        } else if (numberGame.equals("2")) {
            Even.startGame();
        } else if (numberGame.equals("3")) {
            Calc.startGame();
        } else if (numberGame.equals("4")) {
            GCD.gcd();
        } else if (numberGame.equals("5")) {
            Progression.progression();
        }
    }
}
