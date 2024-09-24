package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    public static boolean progression() {

        int numbersMax = 10;

        int[] numbers = new int[numbersMax];
        var scanner = new Scanner(System.in);
        var random = new Random();

        int boundMax = 100;

        var number = random.nextInt(1, boundMax);
        numbers[0] = number;

        int randomCountBoundMax = 5;

        var randomCount = random.nextInt(1, randomCountBoundMax);
        System.out.print("Question: ");
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }

        int randomPositionBoundMax = 9;

        var randomPosition = random.nextInt(randomPositionBoundMax);
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
