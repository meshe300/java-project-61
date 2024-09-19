package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    public static void gcd() {
        Engine.txt("wel");
        var name = Engine.scannerStr();
        System.out.println("Hello, " + name + "!");
        System.out.println("Find the greatest common divisor of given numbers.");
        var count = 0;
        for (int i = 0; i < 3; i++) {
            var numberFirst = Engine.numberRandom(100);
            if (numberFirst == 0) {
                numberFirst += 1;
            }
            var numberSecond = Engine.numberRandom(100);
            if (numberSecond == 0) {
                numberSecond += 1;
            }
            var res = 1;
            if (numberFirst > numberSecond) {
                for (int j = numberSecond; j > 1; j--) {
                    if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                        res = j;
                        if (res == 0) {
                            res += 1;
                        }
                        break;
                    }
                }
            } else if (numberFirst < numberSecond) {
                for (int j = numberFirst; j > 1; j--) {
                    if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                        res = j;
                        if (res == 0) {
                            res += 1;
                        }
                        break;
                    }
                }
            } else if (numberFirst == numberSecond) {
                res = numberFirst;
            }
            System.out.println("Question: " + numberFirst + " " + numberSecond);
            var answer = Engine.scannerInt();
            System.out.println("Your answer: " + answer);
            if (res == answer) {
                Engine.txt("cor");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + res + "'.");
                System.out.println("Let's try again, " + name + "!");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
