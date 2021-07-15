package hexlet.code;

public class Cli {

    private static final String HELLO = "Hello, %s!";

    public static void greetUser(String user) {
        String greeting = String.format(HELLO, user);
        System.out.println(greeting);
    }
}
