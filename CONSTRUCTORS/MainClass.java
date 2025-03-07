class MyClass {

    // Default constructor
    public MyClass() {
        System.out.println("Default Constructor called");
    }

    // One-argument constructor
    public MyClass(int num) {
        System.out.println("One-argument Constructor called with value: " + num);
    }

    // Two-argument constructor
    public MyClass(int num1, int num2) {
        System.out.println("Two-argument Constructor called with values: " + num1 + " and " + num2);
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Calling the default constructor
        MyClass obj1 = new MyClass();

        // Calling the one-argument constructor
        MyClass obj2 = new MyClass(5);

        // Calling the two-argument constructor
        MyClass obj3 = new MyClass(10, 20);
    }
}
