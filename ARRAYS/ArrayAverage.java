public class ArrayAverage {
    
    // Function to calculate the average value of an array
    public static double calculateAverage(int[] array) {
        int sum = 0;  // Variable to store the sum of array elements
        
        // Loop through the array and add each element to the sum
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Calculate and return the average
        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        // Example array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Call the calculateAverage function and print the result
        double result = calculateAverage(numbers);
        System.out.println("The average of the array is: " + result);
    }
}