import java.lang.Math;

public class Commands {
    public static double add(String num1, String num2) {
        double actualNum1;
        double actualNum2;
        if (!num1.equals("pi")) {
            actualNum1 = Double.parseDouble(num1);
        } else {
            actualNum1 = Math.PI;
        }
        if (!num2.equals("pi")) {
            actualNum2 = Double.parseDouble(num2);
        } else {
            actualNum2 = Math.PI;
        }

        return actualNum1 + actualNum2;
    }

    public static double subtract(String num1, String num2) {
        double actualNum1;
        double actualNum2;
        if (!num1.equals("pi")) {
            actualNum1 = Double.parseDouble(num1);
        } else {
            actualNum1 = Math.PI;
        }
        if (!num2.equals("pi")) {
            actualNum2 = Double.parseDouble(num2);
        } else {
            actualNum2 = Math.PI;
        }

        return actualNum1 - actualNum2;
    }

    public static double multiply(String num1, String num2) {
        double actualNum1;
        double actualNum2;
        if (!num1.equals("pi")) {
            actualNum1 = Double.parseDouble(num1);
        } else {
            actualNum1 = Math.PI;
        }
        if (!num2.equals("pi")) {
            actualNum2 = Double.parseDouble(num2);
        } else {
            actualNum2 = Math.PI;
        }

        return actualNum1 * actualNum2;
    }

    public static double divide(String num1, String num2) {
        double actualNum1;
        double actualNum2;
        if (!num1.equals("pi")) {
            actualNum1 = Double.parseDouble(num1);
        } else {
            actualNum1 = Math.PI;
        }
        if (!num2.equals("pi")) {
            actualNum2 = Double.parseDouble(num2);
        } else {
            actualNum2 = Math.PI;
        }

        return actualNum1 / actualNum2;
    }

    public static void help() {
        System.out.println("Help menu:");
        System.out.println("help - Shows all commands");
        System.out.println("add - Adds two numbers");
        System.out.println("subtract - Subtracts num2 from num1");
        System.out.println("multiply - Multiplies two numbers");
        System.out.println("divide - Divides num1 by num2");
    }
}
