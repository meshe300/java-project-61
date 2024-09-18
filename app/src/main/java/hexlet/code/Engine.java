package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void txt(String word) {
        if (word.equals("wel")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.println("May I have your name? ");
        } else if (word.equals("cor")) {
            System.out.println("Correct!");
        }
    }
    public static String scannerStr() {
        var scanner = new Scanner(System.in);
        var name = scanner.next();
        return name;
    }
    public static int numberRandom(int limit) {
        var random = new Random();
        var number = random.nextInt(limit);
        return number;
    }
    public static int scannerInt() {
        var scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        return number;
    }
}
