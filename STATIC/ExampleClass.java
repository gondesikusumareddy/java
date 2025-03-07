public class ExampleClass {
    // Static variable
    static int staticVar = 42;
    
    // Instance method
    void printStaticVar() {
        // Access static variable using the class name
        System.out.println("Static variable using ExampleClass: " + ExampleClass.staticVar);
        
        // You can also access the static variable directly
        System.out.println("Static variable directly: " + staticVar);
    }
    
    public static void main(String[] args) {
        // Create an instance of ExampleClass
        ExampleClass obj = new ExampleClass();
        
        // Call the instance method that prints the static variable
        obj.printStaticVar();
    }
}
