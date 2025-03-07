public class StringCompare {
    public static void main(String[] args) {
        // Define two strings to compare
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "World";
        
        // Compare str1 and str2 (both are "Hello")
        boolean isEqual1 = str1.equals(str2);  // Output: true
        System.out.println("Are str1 and str2 equal? " + isEqual1);
        
        // Compare str1 and str3 (one is "Hello" and the other is "World")
        boolean isEqual2 = str1.equals(str3);  // Output: false
        System.out.println("Are str1 and str3 equal? " + isEqual2);
        
        // Comparing with case sensitivity
        String str4 = "hello";
        boolean isEqual3 = str1.equals(str4);  // Output: false (because "Hello" != "hello")
        System.out.println("Are str1 and str4 equal? " + isEqual3);
    }
}
