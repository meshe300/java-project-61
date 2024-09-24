package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;
import java.util.Scanner;

public class Engine {
    private static final int COUNT = 3;
    private static final int GAME_EVEN = 2;
    private static final int GAME_CALC = 3;
    private static final int GAME_GCD = 4;
    private static final int GAME_PROGRESSION = 5;
    private static final int GAME_PRIME = 6;

    public static void game(int numberGame) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        var count = 0;
        for (int i = 0; i < COUNT; i++) {
            if (numberGame == GAME_EVEN) {
                if (i == 0) {
                    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                }
                var res2  = Even.even();
                if (res2) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == GAME_CALC) {
                if (i == 0) {
                    System.out.println("What is the result of the expression?");
                }
                var res3  = Calc.calc();
                if (res3) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == GAME_GCD) {
                if (i == 0) {
                    System.out.println("Find the greatest common divisor of given numbers.");
                }
                var res4  = GCD.gcd();
                if (res4) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == GAME_PROGRESSION) {
                if (i == 0) {
                    System.out.println("What number is missing in the progression?");
                }
                var res5  = Progression.progression();
                if (res5) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == GAME_PRIME) {
                if (i == 0) {
                    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                }
                var res6  = Prime.prime();
                if (res6) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
