import java.util.Scanner;

public class HelloIntelliJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to display:");
        String message = scanner.nextLine();
        // Display the message
        System.out.println("You entered: " + message);
        // Close the scanner
        scanner.close();
    }
}
