class Modifiers {

    // Private constructor
    private Modifiers() {
        System.out.println("Private Constructor called");
    }

    // Public constructor
    public Modifiers(int num) {
        System.out.println("Public Constructor called with value: " + num);
    }

    // Protected constructor
    protected Modifiers(String message) {
        System.out.println("Protected Constructor called with message: " + message);
    }

    // Default (package-private) constructor
    Modifiers(double value) {
        System.out.println("Default Constructor called with value: " + value);
    }

    // Method to test constructors
    public static void main(String[] args) {
        // Calling public constructor
        Modifiers obj1 = new Modifiers(5);

        // Calling protected constructor from the same class (this works as it's within the same class)
        Modifiers obj2 = new Modifiers("Hello");

        // Calling default constructor (works as it's within the same package)
        Modifiers obj3 = new Modifiers(10.5);

        // Calling private constructor will cause an error if uncommented, as it's not accessible outside the class
        // Modifiers obj4 = new Modifiers();  // This line will cause a compilation error
    }
}
