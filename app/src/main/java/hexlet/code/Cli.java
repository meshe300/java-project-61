package hexlet.code;

import java.util.Scanner;

public class Cli {
    public String userName() {
        var scanner = new Scanner(System.in);
        var name = scanner.next();
        return name;
    }
}
