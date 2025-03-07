import java.util.Arrays;  

public class ArrayReverse {  

    public static void reverseArray(int[] array) {  
        int start = 0;  
        int end = array.length - 1;  

        while (start < end) {  
            // Swap elements at start and end indices  
            int temp = array[start];  
            array[start] = array[end];  
            array[end] = temp;  

            // Move indices towards the middle  
            start++;  
            end--;  
        }  
    }  

    public static void main(String[] args) {  
        int[] numbers = {1, 2, 3, 4, 5};  
        System.out.println("Original Array: " + Arrays.toString(numbers));  

        reverseArray(numbers); // Reverse the array in place  

        System.out.println("Reversed Array: " + Arrays.toString(numbers));  
    }  
}