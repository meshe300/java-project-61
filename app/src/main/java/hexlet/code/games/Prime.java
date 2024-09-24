package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean prime() {
        var scanner = new Scanner(System.in);
        var randomNumber = new Random();
        var number = randomNumber.nextInt(2, 100);
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        System.out.println("Question: " + number);
        var answer = scanner.next();
        System.out.println("Your answer: " + answer);
        var res = false;
        if ((number % 2) != 0 || (number % 3) != 0 && answer.equals("no") && number > 2 && number > 3) {
            res = true;
        } else if ((number % 2) == 0 || (number % 3) == 0 && answer.equals("yes") && number == 2 && number == 3) {
            res = true;
        }
        if (res) {
            System.out.println("Correct!");
            return res;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + number + "'.");
            return false;
        }
    }
}
