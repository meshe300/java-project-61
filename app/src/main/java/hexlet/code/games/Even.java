package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final int MAX_RANDOM = 100;
    private static final int COUNT = 3;
    private  static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void game() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer = "";
        for (int i = 0; i < COUNT; i++) {
            var randomNumber = random.nextInt(1, MAX_RANDOM);
            question = Integer.toString(randomNumber);
            questionAndAnswer[i][0] = question;
            if (isEven(randomNumber)) {
                answer = "yes";
            } else {
                answer = "no";
            }
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }

    private static boolean isEven(int number) {
        boolean result = true;
        if (number == 1 || (number % 2) == 1) {
            result = false;
        }
        return result;
    }
}
