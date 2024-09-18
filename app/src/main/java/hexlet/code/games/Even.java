package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        Engine.txt("wel");
        var name = Engine.scannerStr();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        for (int i = 0; i < 3; i++) {
            var randomNumber = Engine.numberRandom(100);
            if (randomNumber == 1) {
                randomNumber += 1;
            }
            System.out.println("Question: " + randomNumber);
            var evenlyOrNot = Engine.scannerStr();
            System.out.println("Your answer: " + evenlyOrNot);
            if (randomNumber == 1 && evenlyOrNot.equals("no")) {
                Engine.txt("cor");
                count++;
            } else if ((randomNumber % 2) == 0 && evenlyOrNot.equals("yes")) {
                Engine.txt("cor");
                count++;
            } else if ((randomNumber % 2) == 1 && evenlyOrNot.equals("no")) {
                Engine.txt("cor");
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
