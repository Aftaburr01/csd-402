import java.util.ArrayList;
import java.util.Scanner;

public class Program1_ArrayList {

    public static void main(String[] args) {

        // Create ArrayList with at least 10 Strings
        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Orange");
        items.add("Mango");
        items.add("Grapes");
        items.add("Peach");
        items.add("Pear");
        items.add("Plum");
        items.add("Kiwi");

        // Print using for-each loop
        System.out.println("Here are the items in the list:");
        for (String item : items) {
            System.out.println(item);
        }

        Scanner input = new Scanner(System.in);

        // Ask user which element to see again
        System.out.print("\nEnter the index number (0-9) of the element you want to see again: ");
        String userInput = input.nextLine();   // String input

        try {
            // Autoboxing / Auto-Unboxing
            Integer index = Integer.parseInt(userInput); // String ? Integer (autoboxing)
            String selectedItem = items.get(index);      // Auto-unboxing happens here

            System.out.println("You selected: " + selectedItem);

        } catch (Exception e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}