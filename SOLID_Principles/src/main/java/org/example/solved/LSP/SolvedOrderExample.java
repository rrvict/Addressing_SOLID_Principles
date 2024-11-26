package org.example.solved.LSP;

// Example showing adherence to Liskov Substitution Principle.
interface Order {
    void processOrder();
}

class StandardOrder implements Order {
    public void processOrder() {
        System.out.println("Processing a standard order.");
    }
}

class SpecialOrder implements Order {
    public void processOrder() {
        System.out.println("Processing a special order with custom behavior.");
    }
}

public class SolvedOrderExample {
    public static void runExample() {
        System.out.println("Demonstrating adherence to LSP...");
        Order order1 = new StandardOrder();
        Order order2 = new SpecialOrder();

        order1.processOrder();
        order2.processOrder();
    }
}
