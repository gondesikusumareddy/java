public class StringTrim {
    public static void main(String[] args) {
        // Define a string with leading and trailing spaces
        String str1 = "   Hello, World!   ";

        // Use the trim() method to remove leading and trailing spaces
        String trimmedStr = str1.trim();

        // Display the original and trimmed strings
        System.out.println("Original String: '" + str1 + "'");
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
