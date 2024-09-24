package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static void progression() {
        Engine.txt("wel");
        var name = Engine.scannerStr();
        System.out.println("Hello, " + name + "!");
        System.out.println("What number is missing in the progression?");
        var count = 0;
        for (int i = 0; i < 3; i++) {
            int[] numbers = new int[10];
            var randomNumber = Engine.numberRandom(100);
            if (randomNumber == 0) {
                randomNumber += 1;
            }
            numbers[0] = randomNumber;
            var randomCount = Engine.numberRandom(5);
            if (randomCount == 0 || randomCount == 1) {
                randomCount += 1;
            }
            System.out.print("Question: ");
            for (var j = 1; j < numbers.length; j++) {
                numbers[j] = numbers[j - 1] + randomCount;
            }
            var randomPosition = Engine.numberRandom(9);
            for (int j = 0; j < numbers.length; j++) {
                if (j == randomPosition) {
                    System.out.print("... ");
                    continue;
                }
                System.out.print(numbers[j] + " ");
            }
            System.out.println();
            int answer = Engine.scannerInt();
            System.out.println("Your answer: " + answer);
            if (answer == numbers[randomPosition]) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + numbers[randomPosition]
                        + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
