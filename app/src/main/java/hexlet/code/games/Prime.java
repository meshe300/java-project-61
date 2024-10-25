package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final int MAX_RANDOM = 100;
    private static final int COUNT = 3;
    private  static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void prime() {
        var randomNumber = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer;
        for (int i = 0; i < COUNT; i++) {
            var number = randomNumber.nextInt(2, MAX_RANDOM);
            question = Integer.toString(number);
            questionAndAnswer[i][0] = question;
            answer = game(number);
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE,questionAndAnswer);
    }
    public static String game(int number) {
        String answer = "yes";
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                answer = "no";
                break;
            }
        }
        return answer;
    }
}
