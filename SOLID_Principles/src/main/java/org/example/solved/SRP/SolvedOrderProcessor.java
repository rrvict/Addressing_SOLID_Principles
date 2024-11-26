package org.example.solved.SRP;

// Example showing adherence to Single Responsibility Principle.
class OrderManager {
    public void createOrder() {
        System.out.println("Creating an order...");
    }
}

class DiscountCalculator {
    public void calculateDiscount() {
        System.out.println("Calculating discount for the order...");
    }
}

class InvoiceGenerator {
    public void generateInvoice() {
        System.out.println("Generating invoice for the order...");
    }
}

public class SolvedOrderProcessor {
    public static void runExample() {
        System.out.println("Demonstrating adherence to SRP...");
        OrderManager manager = new OrderManager();
        DiscountCalculator calculator = new DiscountCalculator();
        InvoiceGenerator generator = new InvoiceGenerator();

        manager.createOrder();
        calculator.calculateDiscount();
        generator.generateInvoice();
    }
}
