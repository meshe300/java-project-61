package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean prime() {
        var scanner = new Scanner(System.in);
        var randomNumber = new Random();
        int[] listPrimNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73,
                79, 83, 89, 97};
        var number = randomNumber.nextInt(2, 100);
        System.out.println("Question: " + number);
        var answer = scanner.next();
        System.out.println("Your answer: " + answer);
        var count = 0;
        for (int i = 0; i < listPrimNumbers.length; i++) {
            if (answer.equals("yes") && number == listPrimNumbers[i]) {
                System.out.println("Correct!");
                return true;
            }
            count++;
        }
        if (answer.equals("no") && count == listPrimNumbers.length) {
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
