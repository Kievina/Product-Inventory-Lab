import java.util.Scanner;

public class Console {

    public static void printWelcome() {
        System.out.println("" +
                "**************************************************" +
                "***           Welcome and Bienvenue            ***" +
                "***                    to                      ***" +
                "***          ZipCo Inventory Manager           ***" +
                "**************************************************");
    }

    public static void printMenu() {
        System.out.println("1. Create different products to be added to inventory\n" +
                "2. Read from existing products\n" +
                "3. Update products\n" +
                "4. Delete products\n" +
                "5. Get different reports about products\n" +
                "6. Exit the program\n");

    }

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInputInteger = scanner.nextInt();
        return userInputInteger;
    }
}
