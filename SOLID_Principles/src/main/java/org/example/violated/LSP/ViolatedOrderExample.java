package org.example.violated.LSP;

// Example showing violation of Liskov Substitution Principle.
class Order {
    public void processOrder() {
        System.out.println("Processing a general order.");
    }
}

class SpecialOrder extends Order {
    @Override
    public void processOrder() {
        throw new UnsupportedOperationException("SpecialOrder cannot process orders this way!");
    }
}

public class ViolatedOrderExample {
    public static void runExample() {
        Order order = new SpecialOrder();
        System.out.println("Demonstrating violation of LSP...");
        try {
            order.processOrder(); // This will throw an exception.
        } catch (UnsupportedOperationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
