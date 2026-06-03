import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Insert names");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();
                arr.add(name);
                System.out.println("Name added successfully.");
            } else if (choice == 2) {
                System.out.println("Names entered:");
                if (arr.isEmpty()) {
                    System.out.println("No names found.");
                } else {
                    for (String name : arr) {
                        System.out.println(name);
                    }
                }
            } else if (choice == 3) {

                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }
}