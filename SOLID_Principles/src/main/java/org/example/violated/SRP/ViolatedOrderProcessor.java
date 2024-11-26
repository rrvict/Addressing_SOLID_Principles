package org.example.violated.SRP;

// Example showing violation of Single Responsibility Principle.
class Order {
    public void createOrder() {
        System.out.println("Creating an order...");
    }

    public void calculateDiscount() {
        System.out.println("Calculating discount for the order...");
    }

    public void generateInvoice() {
        System.out.println("Generating invoice for the order...");
    }
}

public class ViolatedOrderProcessor {
    public static void runExample() {
        System.out.println("Demonstrating violation of SRP...");
        Order order = new Order();
        order.createOrder();
        order.calculateDiscount();
        order.generateInvoice();
    }
}
