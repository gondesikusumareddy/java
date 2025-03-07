public class SubString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Extracting a substring starting from index 7 to the end of the string
        String substring = str.substring(7); 
        
        // Extracting a substring from index 0 to index 5 (not including 5)
        String substring2 = str.substring(0, 5); 

        System.out.println("Substring from index 7: " + substring);
        System.out.println("Substring from index 0 to 5: " + substring2);
    }
}
