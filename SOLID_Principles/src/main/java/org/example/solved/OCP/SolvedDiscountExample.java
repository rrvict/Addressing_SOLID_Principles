package org.example.solved.OCP;

// Example showing adherence to Open Closed Principle.
interface DiscountStrategy {
    double calculateDiscount(double amount);
}

class RegularDiscount implements DiscountStrategy {
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}

class PremiumDiscount implements DiscountStrategy {
    public double calculateDiscount(double amount) {
        return amount * 0.2;
    }
}

class DiscountCalculator {
    private final DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscount(double amount) {
        return strategy.calculateDiscount(amount);
    }
}

public class SolvedDiscountExample {
    public static void runExample() {
        System.out.println("Demonstrating adherence to OCP...");
        DiscountCalculator regularCalculator = new DiscountCalculator(new RegularDiscount());
        DiscountCalculator premiumCalculator = new DiscountCalculator(new PremiumDiscount());

        System.out.println("Regular Discount: " + regularCalculator.calculateDiscount(1000));
        System.out.println("Premium Discount: " + premiumCalculator.calculateDiscount(1000));
    }
}
