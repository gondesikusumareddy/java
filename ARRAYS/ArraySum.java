public class ArraySum {
    
    // Function to add integer values of an array
    public static int sumArray(int[] array) {
        int sum = 0;  // Variable to store the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];  // Add each element to sum
        }
        return sum;  // Return the sum
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the sumArray function and print the result
        int result = sumArray(numbers);
        System.out.println("The sum of the array is: " + result);
    }
}