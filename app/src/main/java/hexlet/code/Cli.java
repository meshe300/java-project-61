package hexlet.code;

import java.util.Scanner;

public class  Cli {
    public static void cli() {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var name = scanner.next();
        System.out.println("Hello, " + name + "!");
    }
}
