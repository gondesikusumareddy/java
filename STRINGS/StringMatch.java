public class StringMatch {
    public static void main(String[] args) {
        // Define a string to check
        String str = "hello123";
        
        // Regular expression to match a string that starts with "hello" followed by 3 digits
        String regex = "hello\\d{3}";  // \\d{3} means exactly 3 digits
        
        // Check if the string matches the regular expression
        boolean matches = str.matches(regex);
        
        // Output: true because the string "hello123" matches the pattern "hello" followed by 3 digits
        System.out.println("Does the string match the regular expression? " + matches);
    }
}
