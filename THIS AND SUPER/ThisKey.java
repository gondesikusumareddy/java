class ThisKey {

    // Constructor 1 (default constructor)
    public ThisKey() {
        this(10, "Hello from ThisKey");  // Calling Constructor 2 using this()
        System.out.println("Default Constructor Called");
    }

    // Constructor 2 (parameterized constructor)
    public ThisKey(int num, String message) {
        System.out.println("Parameterized Constructor Called");
        System.out.println("Number: " + num);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        ThisKey obj = new ThisKey();
    }
}
