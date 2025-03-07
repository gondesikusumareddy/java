class Main1 {

    // Constructor 1 (default constructor)
    public Main1() {
        this(42, "Welcome to Main1");  // Calling argument constructor using this()
        System.out.println("Default Constructor Called");
    }

    // Constructor 2 (parameterized constructor with arguments)
    public Main1(int num, String message) {
        System.out.println("Argument Constructor Called");
        System.out.println("Number: " + num);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        Main1 obj = new Main1();
    }
}
