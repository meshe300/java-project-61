package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Calc {
    private static final int MAX_RANDOM = 100;
    private static final int SYMBOL_COUNT = 3;
    private static final int COUNT = 3;
    private  static final String RULE = "What is the result of the expression?";

    public static void game() {
        var random = new Random();
        String[] symbols = {"+", "-", "*"};
        String[][] questionAndAnswer = new String[COUNT][2];
        String question;
        String answer;
        for (int i = 0; i < COUNT; i++) {
            var position = random.nextInt(SYMBOL_COUNT);
            var numberFirst = random.nextInt(1, MAX_RANDOM);
            var numberSecond = random.nextInt(1, MAX_RANDOM);
            var symbol = symbols[position];
            question = numberFirst + " " + symbol + " " + numberSecond;
            questionAndAnswer[i][0] = question;
            answer = Integer.toString(calculate(numberFirst, numberSecond, symbol));
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }
    private static Integer calculate(int numberFirst, int numberSecond, String symbol) {
        Integer result = null;
        switch (symbol) {
            case "+":
                result = numberFirst + numberSecond;
                break;
            case "-":
                result = numberFirst - numberSecond;
                break;
            case "*":
                result = numberFirst * numberSecond;
                break;
            default:
                break;
        }
        return result;
    }
}
