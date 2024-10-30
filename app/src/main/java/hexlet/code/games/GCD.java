package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final int MAX_RANDOM = 100;
    private static final int COUNT = 3;
    private  static final String RULE = "Find the greatest common divisor of given numbers.";

    public static void game() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer;
        for (int i = 0; i < COUNT; i++) {
            var numberFirst = random.nextInt(1, MAX_RANDOM);
            var numberSecond = random.nextInt(1, MAX_RANDOM);
            question = numberFirst + " " + numberSecond;
            questionAndAnswer[i][0] = question;
            answer = Integer.toString(gcd(numberFirst, numberSecond));
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
