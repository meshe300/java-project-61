package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static boolean progression() {
        int[] numbers = new int[10];
        var scanner = new Scanner(System.in);
        var random = new Random();
        var number = random.nextInt(1, 100);
        numbers[0] = number;
        var randomCount = random.nextInt(1, 5);
        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }
        var randomPosition = random.nextInt(9);
        for (int j = 0; j < numbers.length; j++) {
            if (j == randomPosition) {
                System.out.print("... ");
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
