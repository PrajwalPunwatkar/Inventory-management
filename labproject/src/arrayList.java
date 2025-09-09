import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class arrayList {

    public static void main(String[] args) {
        // Create an ArrayList to hold String elements
        ArrayList<String> list = new ArrayList<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nArrayList Operations Menu:");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Update Element");
            System.out.println("4. Display Elements");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Adding an element
                    System.out.print("Enter a string to add: ");
                    String elementToAdd = scanner.nextLine();
                    list.add(elementToAdd);
                    System.out.println(elementToAdd + " added to the list.");
                    break;

                case 2:
                    // Removing an element
                    System.out.print("Enter the index of the element to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < list.size()) {
                        String removedElement = list.remove(indexToRemove);
                        System.out.println(removedElement + " removed from the list.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 3:
                    // Updating an element
                    System.out.print("Enter the index of the element to update: ");
                    int indexToUpdate = scanner.nextInt();
                    if (indexToUpdate >= 0 && indexToUpdate < list.size()) {
                        System.out.print("Enter the new string: ");
                        String newElement = scanner.nextLine();
                        list.set(indexToUpdate, newElement);
                        System.out.println("Element at index " + indexToUpdate + " updated.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    // Displaying elements
                    System.out.println("Current elements in the list:");
                    if (list.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println(i + ": " + list.get(i));
                        }
                    }
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}