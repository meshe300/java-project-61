package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import hexlet.code.games.Even;

import java.util.Scanner;

public class Engine {
    public static void game(int numberGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        var scanner = new Scanner(System.in);
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        var count = 3;
        for (int i = 0; i < 3; i++) {
            if (numberGame == 2) {
                var res2  = Even.even();
                if (res2) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == 3) {
                var res3  = Calc.calc();
                if (res3) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == 4) {
                var res4  = GCD.gcd();
                if (res4) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == 5) {
                var res5  = Progression.progression();
                if (res5) {
                    count++;
                } else {
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (numberGame == 6) {
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
