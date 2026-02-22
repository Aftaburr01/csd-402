import java.util.ArrayList;
import java.util.Scanner;

/**
 * AftabArrayListTest.java
 * This program demonstrates using an ArrayList to store user-entered integers
 * and finding the maximum value within that collection.
 */
public class AftabArrayListTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop): ");

        // Capture user input until 0 is entered
        while (true) {
            int value = input.nextInt();
            numbers.add(value); // Add the value to the ArrayList
            if (value == 0) {
                break; // Exit loop after adding the zero
            }
        }

        // Call the static method and display the result
        Integer largestValue = max(numbers);
        System.out.println("The largest value in the list is: " + largestValue);
    }

    /**
     * Finds the largest value in an ArrayList of Integers.
     * @param list The ArrayList to search.
     * @return The largest Integer, or 0 if the list is empty.
     */
    public static Integer max(ArrayList<Integer> list) {
        // Return 0 if the list is null or empty
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer maximum = list.get(0);

        // Iterate through the collection to find the largest instance
        for (Integer i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }

        return maximum;
    }
}