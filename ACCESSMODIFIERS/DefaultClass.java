// Class with default fields and methods
class DefaultClass {
    // Default fields (package-private access)
    String name;
    int age;

    // Default constructor
    DefaultClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
