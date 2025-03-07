class Calling {

    // Default constructor
    public Calling() {
        System.out.println("Default Constructor called");
    }

    // Constructor with one argument
    public Calling(int num) {
        System.out.println("Constructor with one argument called: " + num);
    }

    // Constructor with two arguments
    public Calling(String message, int num) {
        System.out.println("Constructor with two arguments called: " + message + ", " + num);
    }

    // Method to simulate calling multiple constructors
    public void callConstructors() {
        // Simulate the behavior of calling constructors from methods (this doesn't call the constructor again)
        System.out.println("Simulating multiple constructor calls in a method:");
        new Calling();  // Call the default constructor
        new Calling(10);  // Call the constructor with one argument
        new Calling("Hello", 20);  // Call the constructor with two arguments
    }

    public static void main(String[] args) {
        // Create an object of the Calling class using the default constructor
        Calling obj = new Calling();
        
        // Call the method to simulate multiple constructor calls
        obj.callConstructors();
    }
}
