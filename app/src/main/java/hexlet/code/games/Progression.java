package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_NUMBERS = 10;;
    private static final int MAX_DIFFERENCE = 5;
    private static final int MAX_POSITION = 9;

    public static boolean progression() {

        int[] numbers = new int[MAX_NUMBERS];
        var scanner = new Scanner(System.in);
        var random = new Random();
        var number = random.nextInt(1, MAX_RANDOM);
        numbers[0] = number;
        var randomCount = random.nextInt(1, MAX_DIFFERENCE);
        System.out.print("Question: ");
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }
        var randomPosition = random.nextInt(MAX_POSITION);
        for (int j = 0; j < numbers.length; j++) {
            if (j == randomPosition) {
                System.out.print(".. ");
                continue;
            }
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        int answer = scanner.nextInt();
        System.out.println("Your answer: " + answer);
        if (answer == numbers[randomPosition]) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + numbers[randomPosition]
                    + "'.");
            return false;
        }
    }
}
