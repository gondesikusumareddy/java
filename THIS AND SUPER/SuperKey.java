class SuperKey {
    // Parent class constructor
    public SuperKey() {
        System.out.println("Parent class constructor called!");
    }
}

class SubKey extends SuperKey {
    // Child class constructor
    public SubKey() {
        super();  // Calling the parent class constructor using super()
        System.out.println("Child class constructor called!");
    }

    public static void main(String[] args) {
        // Create an object of SubKey class
        SubKey obj = new SubKey();
    }
}
