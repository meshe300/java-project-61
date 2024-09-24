package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static final int max_random_numbers = 100;
    private static final int max_numbers = 10;;
    private static final int max_difference = 5;
    private static final int max_position = 9;

    public static boolean progression() {

        int[] numbers = new int[max_numbers];
        var scanner = new Scanner(System.in);
        var random = new Random();
        var number = random.nextInt(1, max_random_numbers);
        numbers[0] = number;
        var randomCount = random.nextInt(1, max_difference);
        System.out.print("Question: ");
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }
        var randomPosition = random.nextInt(max_position);
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
