import java.lang.reflect.Field;

public class MyClass {
    // Instance members (fields)
    final int field1 = 10;
    final String field2 = "Hello";

    // Static method to print fields using reflection
    public static void printFieldsUsingThis() {
        try {
            // Get the class of the current object
            Class<?> clazz = MyClass.class;

            // Get all the fields (instance members) of the class
            Field[] fields = clazz.getDeclaredFields();

            // Loop through all fields and print their names and values
            for (Field field : fields) {
                field.setAccessible(true); // Make private fields accessible
                System.out.println("Field name: " + field.getName() + ", Value: " + field.get(null)); // Since no object is being used
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Call static method to print fields using reflection
        printFieldsUsingThis();
    }
}
