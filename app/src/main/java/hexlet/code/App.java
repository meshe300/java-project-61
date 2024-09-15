package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        var scan = new Cli();
        System.out.print("May I have your name?");
        var name = scan.userName();
        System.out.println("Hello, " + name + "!");
    }
}
