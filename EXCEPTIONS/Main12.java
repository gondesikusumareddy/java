import java.io.FileReader;
import java.io.IOException;

public class Main12{
    public static void main(String[] args) {
        try {
            // Attempting to read from a non-existent file
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (IOException e) {
            // Catch and print the IOException
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
