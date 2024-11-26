package org.example.violated.OCP;

// Example showing violation of Open Closed Principle.
class DiscountCalculator {
    public double calculateDiscount(String orderType, double amount) {
        if ("Regular".equals(orderType)) {
            return amount * 0.1;
        } else if ("Premium".equals(orderType)) {
            return amount * 0.2;
        }
        return 0.0;
    }
}

public class ViolatedDiscountExample {
    public static void runExample() {
        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println("Demonstrating violation of OCP...");
        double discount = calculator.calculateDiscount("Premium", 1000);
        System.out.println("Discount calculated: " + discount);
    }
}
