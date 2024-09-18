package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static void startGame() {
        char[] symbols = {'+', '-', '*'};
        Engine.txt("wel");
        var name = Engine.scannerStr();
        System.out.println("Hello, " + name + "!");
        System.out.println("What is the result of the expression?");
        var count = 0;
        for (int i = 0; i < 3; i++) {
            var position = Engine.numberRandom(3);
            var numberFirst = Engine.numberRandom(100);
            var numberSecond = Engine.numberRandom(100);
            var symbol = symbols[position];
            if (numberFirst == 1) {
                numberFirst += 1;
            } else if (numberSecond == 1) {
                numberSecond += 1;
            }
            if (symbol == '+') {
                System.out.println("Question: " + numberFirst + " + " + numberSecond);
                var sum = numberFirst + numberSecond;
                var res = Engine.scannerInt();
                System.out.println("Your answer: " + res);
                if (res == sum) {
                    Engine.txt("cor");
                    count++;
                } else {
                    System.out.println("'" + res + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (symbol == '-') {
                System.out.println("Question: " + numberFirst + " - " + numberSecond);
                var sum = numberFirst - numberSecond;
                var res = Engine.scannerInt();
                System.out.println("Your answer: " + res);
                if (res == sum) {
                    Engine.txt("cor");
                    count++;
                } else {
                    System.out.println("'" + res + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            } else if (symbol == '*') {
                System.out.println("Question: " + numberFirst + " * " + numberSecond);
                var sum = numberFirst * numberSecond;
                var res = Engine.scannerInt();
                System.out.println("Your answer: " + res);
                if (res == sum) {
                    Engine.txt("cor");
                    count++;
                } else {
                    System.out.println("'" + res + "' is wrong answer ;(. Correct answer was '" + sum + "'.");
                    System.out.println("Let's try again, " + name + "!");
                    break;
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
