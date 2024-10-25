package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_NUMBERS = 10;;
    private static final int MAX_DIFFERENCE = 5;
    private static final int MAX_POSITION = 9;
    private static final int COUNT = 3;
    private  static final String RULE = "What number is missing in the progression?";

    public static void progression() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String answer;
        for (int i = 0; i < COUNT; i++) {
            String question = "";
            int[] numbers = new int[MAX_NUMBERS];
            String[] skipList = new String[MAX_NUMBERS];
            var number = random.nextInt(1, MAX_RANDOM);
            numbers[0] = number;
            var randomCount = random.nextInt(1, MAX_DIFFERENCE);
            var randomPosition = random.nextInt(MAX_POSITION);
            for (var j = 1; j < numbers.length; j++) {
                numbers[j] = numbers[j - 1] + randomCount;
            }
            for (int j = 0; j < skipList.length; j++) {
                skipList[j] = Integer.toString(numbers[j]);
                if (j == randomPosition) {
                    skipList[j] = "..";
                }
                question += skipList[j] + " ";
            }
            answer = Integer.toString(game(numbers, randomPosition));
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE,questionAndAnswer);
    }
    public static int game(int[] numbers, int position) {
        return  numbers[position];
    }
}
