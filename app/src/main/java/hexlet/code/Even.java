package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        var random = new Random();
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            var randomNumber = random.nextInt(100);
            if (randomNumber == 0) {
                randomNumber += 1;
            }
            System.out.println("Question: " + randomNumber);
            var evenlyOrNot = scanner.next();
            System.out.println("Your answer: " + evenlyOrNot);
            if (randomNumber == 1 && evenlyOrNot.equals("no")) {
                System.out.println("Correct!");
                count++;
            } else if ((randomNumber % 2) == 0 && evenlyOrNot.equals("yes")) {
                System.out.println("Correct!");
                count++;
            } else if ((randomNumber % 2) == 1 && evenlyOrNot.equals("no")) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
