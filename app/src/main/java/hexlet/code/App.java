package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int CLI_NUMBER = 1;
    private static final int EVEN_NUMBER = 2;
    private static final int CALC_NUMBER = 3;
    private static final int GCD_NUMBER = 4;
    private static final int PROGRESSION_NUMBER = 5;
    private static final int PRIME_NUMBER = 6;

    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        var numberGame = scan.nextInt();
        System.out.println("Your choice: " + numberGame);
        switch (numberGame) {
            case CLI_NUMBER:
                Cli.cli();
                break;
            case EVEN_NUMBER:
                Even.even();
                break;
            case CALC_NUMBER:
                Calc.calc();
                break;
            case GCD_NUMBER:
                GCD.gcd();
                break;
            case PROGRESSION_NUMBER:
                Progression.progression();
                break;
            case PRIME_NUMBER:
                Prime.prime();
                break;
            default:
                break;
        }
    }
}
