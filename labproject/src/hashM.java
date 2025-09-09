import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hashM {

    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                uniqueNumbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer or 'done' to finish.");
            }
        }

        System.out.println("Unique numbers entered: " + uniqueNumbers);
        scanner.close();
    }
}