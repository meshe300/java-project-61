package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int COUNT = 3;

    public static void engine(String gameRule, String[][] questionAndAnswer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scan.next();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameRule);
        boolean result = true;
        for (int i = 0; i < COUNT; i++) {
            System.out.println("Question: " + questionAndAnswer[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(questionAndAnswer[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + questionAndAnswer[i][1] + ".");
                result = false;
                break;
            }
        }
        if (result) {
            System.out.println("Congratulations, " + name + "!");
        } else {
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
