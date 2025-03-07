class Return {

    // Constructor to initialize the class
    public Return() {
        System.out.println("Constructor of Return class called");
    }

    // Method that returns an int
    public int getNumber() {
        return 42; // Returning an int value
    }

    // Method that returns a String
    public String getMessage() {
        return "Hello, this is a string message."; // Returning a String value
    }

    public static void main(String[] args) {
        // Creating an object of the Return class
        Return obj = new Return();

        // Calling method that returns an int
        int number = obj.getNumber();
        System.out.println("Returned int value: " + number);

        // Calling method that returns a String
        String message = obj.getMessage();
        System.out.println("Returned String value: " + message);
    }
}
