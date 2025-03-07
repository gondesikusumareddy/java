public class StringMethods {
    public static void main(String[] args) {
        // Define two strings for comparison
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "Java Programming";

        // equalsIgnoreCase() - Compares two strings, ignoring case differences
        System.out.println("Using equalsIgnoreCase:");
        System.out.println(str1.equalsIgnoreCase(str2));  // true, because case is ignored
        System.out.println();

        // startsWith() - Checks if a string starts with a specified prefix
        System.out.println("Using startsWith:");
        System.out.println(str1.startsWith("Hello"));  // true, because str1 starts with "Hello"
        System.out.println(str1.startsWith("World"));  // false, because str1 does not start with "World"
        System.out.println();

        // endsWith() - Checks if a string ends with a specified suffix
        System.out.println("Using endsWith:");
        System.out.println(str1.endsWith("World"));  // true, because str1 ends with "World"
        System.out.println(str1.endsWith("Java"));   // false, because str1 does not end with "Java"
        System.out.println();

        // compareTo() - Compares two strings lexicographically
        System.out.println("Using compareTo:");
        System.out.println(str1.compareTo(str2));  // Outputs a positive number because "Hello World" > "hello world"
        System.out.println(str1.compareTo(str3));  // Outputs a negative number because "Hello World" < "Java Programming"
        System.out.println();
    }
}
