class SuperClass {
    // Instance members (fields) of the parent class
    protected int field1 = 10;
    protected String field2 = "Hello from SuperClass";

    // Constructor of the parent class
    public SuperClass() {
        System.out.println("SuperClass Constructor");
    }
}

class SubClass extends SuperClass {
    // Constructor of the subclass
    public SubClass() {
        super();  // Calling the constructor of the parent class
        System.out.println("SubClass Constructor");
    }

    // Method to print the fields of the parent class using 'super'
    public void printParentFields() {
        System.out.println("Field1 from SuperClass: " + super.field1);
        System.out.println("Field2 from SuperClass: " + super.field2);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of SubClass
        SubClass subClassObject = new SubClass();

        // Call the method to print the parent class fields
        subClassObject.printParentFields();
    }
}
