public class StringSplit {
    public static void main(String[] args) {
        // Define a string with words separated by spaces
        String str = "Java is awesome and fun";

        // Use the split() method to split the string by spaces
        String[] words = str.split(" ");  // Split by space

        // Display the original string
        System.out.println("Original String: " + str);

        // Display each word after splitting
        System.out.println("Words after splitting:");
        for (String word : words) {
            System.out.println(word);
        }

        // Example of splitting with a different delimiter (comma)
        String str2 = "apple,banana,orange,grape";
        String[] fruits = str2.split(",");  // Split by comma

        // Display the result after splitting by comma
        System.out.println("\nFruits after splitting:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
