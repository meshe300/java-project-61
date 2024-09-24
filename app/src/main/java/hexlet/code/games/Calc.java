package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static boolean calc() {
        var scanner = new Scanner(System.in);
        var random = new Random();
        char[] symbols = {'+', '-', '*'};
        var position = random.nextInt(3);
        var numberFirst = random.nextInt(1, 100);
        var numberSecond = random.nextInt(1, 100);
        var symbol = symbols[position];
        System.out.println("Question: " + numberFirst + " " + symbol + " " + numberSecond);
        var res = 0;
        if (symbol == '+') {
            res = numberFirst + numberSecond;
        } else if (symbol == '-') {
            res = numberFirst - numberSecond;
        } else if (symbol == '*') {
            res = numberFirst * numberSecond;
        }
        var answer = scanner.nextInt();
        System.out.println("Your answer: " + answer);
        if (answer == res) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + res + "'.");
            return false;
        }
    }
}
