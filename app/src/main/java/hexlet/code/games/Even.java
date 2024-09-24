package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static boolean even() {
        var scanner = new Scanner(System.in);
        var random = new Random();
        var randomNumber = random.nextInt(1, 100);
        System.out.println("Question: " + randomNumber);
        var evenlyOrNot = scanner.next();
        System.out.println("Your answer: " + evenlyOrNot);
        var res = false;
        if (randomNumber == 1 && evenlyOrNot.equals("no")) {
            res = true;
        } else if ((randomNumber % 2) == 0 && evenlyOrNot.equals("yes")) {
            res = true;
        } else if ((randomNumber % 2) == 1 && evenlyOrNot.equals("no")) {
            res = true;
        }
        if (res) {
            System.out.println("Correct!");
        } else {
            System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
        }
        return res;
    }
}
