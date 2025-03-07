public class StringConvert{
    public static void main(String[] args) {
        // Example integer
        int number = 123;

        // Method 1: Using Integer.toString()
        String str1 = Integer.toString(number);
        System.out.println("Using Integer.toString(): " + str1);

        // Method 2: Using String.valueOf()
        String str2 = String.valueOf(number);
        System.out.println("Using String.valueOf(): " + str2);

        // Method 3: Using concatenation with an empty string
        String str3 = number + "";
        System.out.println("Using concatenation with an empty string: " + str3);
    }
}
