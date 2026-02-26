import java.io.*;
import java.util.Random;

public class Program2_FileHandling {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            // Create file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists. Appending data...");
            }

            // Write or append to file
            FileWriter writer = new FileWriter(file, true); // true = append mode

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100); // Random number 0-99
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Data written to file.");

            // Reopen and read file
            BufferedReader reader = new BufferedReader(new FileReader(file));

            String line;
            System.out.println("\nData inside file:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}