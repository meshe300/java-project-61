package hexlet.code;

import java.util.Scanner;

public final class  Cli {
    private static String name = "";
    public static void startProgramm() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        var scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}