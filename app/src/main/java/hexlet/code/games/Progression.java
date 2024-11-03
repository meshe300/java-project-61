package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int MAX_RANDOM = 100;
    private static final int MAX_NUMBERS = 10;;
    private static final int MIN_NUMBERS = 5;
    private static final int MAX_DIFFERENCE = 5;
    private static final int COUNT = 3;
    private  static final String RULE = "What number is missing in the progression?";

    public static void game() {
        var random = new Random();
        String[][] questionAndAnswer = new String[COUNT][2];
        String answer;
        for (int i = 0; i < COUNT; i++) {
            String question = "";
            var maxProgression = random.nextInt(MIN_NUMBERS, MAX_NUMBERS);
            var randomCount = random.nextInt(1, MAX_DIFFERENCE);
            var firstNumber = random.nextInt(1, MAX_RANDOM);
            int[] numbers = creatingProgression(maxProgression, randomCount, firstNumber);
            var randomPosition = random.nextInt(maxProgression);
            answer = Integer.toString(numbers[randomPosition]);
            String[] skipList = new String[maxProgression];
            for (int j = 0; j < skipList.length; j++) {
                skipList[j] = Integer.toString(numbers[j]);
            }
            skipList[randomPosition] = "..";
            question = String.join(" ", skipList);
            questionAndAnswer[i][0] = question;
            questionAndAnswer[i][1] = answer;
        }
        Engine.engine(RULE, questionAndAnswer);
    }
    private static int[] creatingProgression(int maxProgression, int randomCount, int firstNumber) {
        int[] numbers = new int[maxProgression];
        numbers[0] = firstNumber;
        for (var j = 1; j < numbers.length; j++) {
            numbers[j] = numbers[j - 1] + randomCount;
        }
        return numbers;
    }
}
