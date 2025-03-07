class Vehicle {
    // Default constructor of the superclass
    public Vehicle() {
        System.out.println("Vehicle class default constructor called");
    }

    // Argument constructor of the superclass
    public Vehicle(String type) {
        System.out.println("Vehicle class constructor called with type: " + type);
    }
}

class Car extends Vehicle {
    // Default constructor of the child class
    public Car() {
        super();  // Calling the default constructor of the parent class (Vehicle)
        System.out.println("Car class default constructor called");
    }

    // Argument constructor of the child class
    public Car(String model) {
        super("Car");  // Calling the argument constructor of the parent class (Vehicle)
        System.out.println("Car class constructor called with model: " + model);
    }

    public static void main(String[] args) {
        // Creating an object of Car using the default constructor
        Car car1 = new Car();

        // Creating an object of Car using the argument constructor
        Car car2 = new Car("Sedan");
    }
}
