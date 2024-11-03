package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MAX_RANDOM = 100;
    private static final int COUNT = 3;
    private  static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void game() {
        var randomNumber = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer;
        for (int i = 0; i < COUNT; i++) {
            var number = randomNumber.nextInt(2, MAX_RANDOM);
            question = Integer.toString(number);
            questionAndAnswer[i][0] = question;
            if (isPrime(number)) {
                answer = "yes";
            } else {
                answer = "no";
            }
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }
    private static boolean isPrime(int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
