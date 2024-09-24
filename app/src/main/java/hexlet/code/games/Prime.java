package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static final int MAX_RANDOM = 100;

    public static boolean prime() {
        var scanner = new Scanner(System.in);
        var randomNumber = new Random();
        var number = randomNumber.nextInt(2, MAX_RANDOM);
        System.out.println("Question: " + number);
        var answer = scanner.next();
        System.out.println("Your answer: " + answer);
        var res = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                res = true;
                break;
            }
        }
        if (!res && answer.equals("yes")) {
            System.out.println("Correct!");
            return true;
        } else if (res && answer.equals("no")) {
            System.out.println("Correct!");
            return true;
        } else {
            if (answer.equals("yes")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'no'.");
            } else if (answer.equals("no")) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was 'yes'.");
            }
            return false;
        }
    }
}
