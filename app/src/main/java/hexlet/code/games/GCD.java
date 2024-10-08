package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    private static final int MAX_RANDOM = 100;

    public static boolean gcd() {
        var random = new Random();
        var scanner = new Scanner(System.in);
        var numberFirst = random.nextInt(1, MAX_RANDOM);
        var numberSecond = random.nextInt(1, MAX_RANDOM);
        var res = 1;
        if (numberFirst > numberSecond) {
            for (int j = numberSecond; j > 1; j--) {
                if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                    res = j;
                    if (res == 0) {
                        res += 1;
                    }
                    break;
                }
            }
        } else if (numberFirst < numberSecond) {
            for (int j = numberFirst; j > 1; j--) {
                if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                    res = j;
                    if (res == 0) {
                        res += 1;
                    }
                    break;
                }
            }
        } else if (numberFirst == numberSecond) {
            res = numberFirst;
        }
        System.out.println("Question: " + numberFirst + " " + numberSecond);
        var answer = scanner.nextInt();
        System.out.println("Your answer: " + answer);
        if (res == answer) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + res + "'.");
            return false;
        }
    }
}
