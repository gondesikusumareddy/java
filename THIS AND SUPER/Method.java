class Parent {
    // Parent class method
    public void displayMessage() {
        System.out.println("Message from Parent class");
    }
}

class Method extends Parent {

    // Method in the child class that calls another method in the same class using 'this()'
    public void methodOne() {
        this.methodTwo();  // Calling methodTwo() from the same class using 'this()'
        System.out.println("Method One called in Method class");
    }

    // Another method in the same class
    public void methodTwo() {
        System.out.println("Method Two called in Method class");
    }

    // Method in the child class that calls a method from the parent class using 'super()'
    public void methodThree() {
        super.displayMessage();  // Calling Parent class method using 'super()'
        System.out.println("Method Three called in Method class");
    }

    public static void main(String[] args) {
        // Create an object of the Method class
        Method obj = new Method();

        // Call methodOne, which internally calls methodTwo using 'this()'
        obj.methodOne();

        // Call methodThree, which calls a method from the Parent class using 'super()'
        obj.methodThree();
    }
}
