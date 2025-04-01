import java.lang.Math;

public class Commands {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

    public static void help() {
        System.out.println("Help menu:");
        System.out.println("help - Shows all commands");
        System.out.println("add - Adds two numbers");
    }
}
