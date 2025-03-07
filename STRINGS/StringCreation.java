public class StringCreation {

    public static void main(String[] args) {

        // 1. Using String Literal
        String str1 = "Hello, World!";
        System.out.println("Using String Literal: " + str1);

        // 2. Using new keyword
        String str2 = new String("Hello, Java!");
        System.out.println("Using new keyword: " + str2);

        // 3. Using StringBuilder
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Hello, StringBuilder!");
        String str3 = strBuilder.toString();
        System.out.println("Using StringBuilder: " + str3);

        // 4. Using char[] Array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'a', 'v', 'a'};
        String str4 = new String(charArray);
        System.out.println("Using char[] Array: " + str4);
    }
}
