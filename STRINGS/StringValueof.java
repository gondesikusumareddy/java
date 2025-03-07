public class StringValueof{
    public static void main(String[] args) {
        // Define different types of numbers
        int num1 = 42;
        double num2 = 3.14159;
        float num3 = 2.718f;
        long num4 = 123456789L;

        // Convert numbers to strings using valueOf()
        String str1 = String.valueOf(num1);  // Convert int to String
        String str2 = String.valueOf(num2);  // Convert double to String
        String str3 = String.valueOf(num3);  // Convert float to String
        String str4 = String.valueOf(num4);  // Convert long to String

        // Display the converted strings
        System.out.println("Integer as String: " + str1);
        System.out.println("Double as String: " + str2);
        System.out.println("Float as String: " + str3);
        System.out.println("Long as String: " + str4);
    }
}
