package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_RANDOM = 100;
    private static final int COUNT = 3;
    private  static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void gcd() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer;
        for (int i = 0; i < COUNT; i++) {
            var numberFirst = random.nextInt(1, MAX_RANDOM);
            var numberSecond = random.nextInt(1, MAX_RANDOM);
            question = numberFirst + " " + numberSecond;
            questionAndAnswer[i][0] = question;
            answer = Integer.toString(game(numberFirst, numberSecond));
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE,questionAndAnswer);
    }
    public static int game(int numberFirst, int numberSecond) {
        var result = 1;
        if (numberFirst > numberSecond) {
            for (int j = numberSecond; j > 1; j--) {
                if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                    result = j;
                    if (result == 0) {
                        result += 1;
                    }
                    break;
                }
            }
        } else if (numberFirst < numberSecond) {
            for (int j = numberFirst; j > 1; j--) {
                if ((numberSecond % j) == 0 && (numberFirst % j) == 0) {
                    result = j;
                    if (result == 0) {
                        result += 1;
                    }
                    break;
                }
            }
        } else if (numberFirst == numberSecond) {
            result = numberFirst;
        }
        return result;
    }
}
