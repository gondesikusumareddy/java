// Class with private fields and a private method
class MyClass {
    // Private fields
    final String name;
    final int age;

    // Constructor to initialize fields
    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Private method
    private void displayPrivateMessage() {
        System.out.println("This is a private method!");
    }

    // Public method to access private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Public method to call the private method
    public void callPrivateMethod() {
        displayPrivateMessage();
    }

    // Main method
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass obj = new MyClass("John", 25);

        // Accessing private fields using public getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Calling the private method through a public method
        obj.callPrivateMethod();
    }
}
