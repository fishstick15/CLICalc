public class Main {
    public static void calc() {
        Input in = new Input();
        Commands commands = new Commands();

        System.out.println();
        String command = in.get("");
        if (command.equals("help")) {
            commands.help();
            calc();
        } else if (command.equals("add")) {
            System.out.println("Select two numbers to add: ");
            int num1 = Integer.parseInt(in.get("num1"));
            int num2 = Integer.parseInt(in.get("num2"));
            System.out.println("result: " + commands.add(num1, num2));
            calc();

        } else if (command.equals("subtract")) {
            System.out.println("Select two numbers to subtract (num2 will be subtracted from num1): ");
            int num1 = Integer.parseInt(in.get("num1"));
            int num2 = Integer.parseInt(in.get("num2"));
            System.out.println("result: " + commands.subtract(num1, num2));
            calc();
        } else if (command.equals("multiply")){
            System.out.println("Select two numbers to multiply: ");
            int num1 = Integer.parseInt(in.get("num1"));
            int num2 = Integer.parseInt(in.get("num2"));
            System.out.println("result: " + commands.multiply(num1, num2));
            calc();
        } else if (command.equals("divide")){
            System.out.println("Select two numbers to divide: ");
            int num1 = Integer.parseInt(in.get("num1"));
            int num2 = Integer.parseInt(in.get("num2"));
            System.out.println("result: " + commands.divide(num1, num2));
            calc();
        }
        main(null);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to CLI Calc!");
        System.out.println("Version 1.0.0-1");
        calc();
    }
}