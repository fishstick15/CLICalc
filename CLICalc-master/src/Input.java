import java.util.Scanner;

public class Input {
    static final Scanner scan = new Scanner(System.in);

    public static String get(String ask) {
        System.out.println(ask + " >> ");
        return scan.next();

    }
    public static void close() {
        scan.close();
    }


}
