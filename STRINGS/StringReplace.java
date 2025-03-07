public class StringReplace {
    public static void main(String[] args) {
        // Define a string with some characters to be replaced
        String str = "Hello, World!";

        // Use the replace() method to replace a character
        String replacedStr = str.replace('o', '0');  // Replace 'o' with '0'

        // Display the original and replaced strings
        System.out.println("Original String: " + str);
        System.out.println("Replaced String: " + replacedStr);

        // Replace a substring with another substring
        String str2 = "I love Java programming!";
        String replacedStr2 = str2.replace("Java", "Python");  // Replace "Java" with "Python"

        // Display the string after replacing the substring
        System.out.println("Original String: " + str2);
        System.out.println("Replaced String: " + replacedStr2);
    }
}
