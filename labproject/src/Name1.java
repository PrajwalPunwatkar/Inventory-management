import java.util.Scanner;
import java.util.TreeSet;

public class Name1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numbers = new TreeSet<>();

        System.out.println("Enter integers (type 'exit' to finish):");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Please enter a valid integer or 'exit' to finish.");
            }
        }

        System.out.println("Sorted integers:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }
}