package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_NUMBERS = 10;;
    private static final int MAX_DIFFERENCE = 5;
    private static final int COUNT = 3;
    private  static final String RULE = "What number is missing in the progression?";

    public static void game() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String answer;
        for (int i = 0; i < COUNT; i++) {
            String question = "";
            var maxProgression = random.nextInt(5, MAX_NUMBERS);
            var randomCount = random.nextInt(1, MAX_DIFFERENCE);
            var firstNumber = random.nextInt(1, MAX_RANDOM);
            int[] numbers = progression(maxProgression, randomCount, firstNumber);
            var randomPosition = random.nextInt(maxProgression);
            answer = Integer.toString(numbers[randomPosition]);
            String[] skipList = new String[maxProgression];
            for (int j = 0; j < skipList.length; j++) {
                skipList[j] = Integer.toString(numbers[j]);
                if (j == randomPosition) {
                    skipList[j] = "..";
                }
                question += skipList[j] + " ";
            }
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }
    private static int[] progression(int maxProgression, int randomCount, int firstNumber) {
        int[] numbers = new int[maxProgression];
        numbers[0] = firstNumber;
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }
        return numbers;
    }
}
