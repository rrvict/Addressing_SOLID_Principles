package org.example;

import org.example.solved.LSP.SolvedOrderExample;
import org.example.solved.OCP.SolvedDiscountExample;
import org.example.solved.SRP.SolvedOrderProcessor;
import org.example.violated.LSP.ViolatedOrderExample;
import org.example.violated.OCP.ViolatedDiscountExample;
import org.example.violated.SRP.ViolatedOrderProcessor;

public class Main {
    public static void main(String[] args) {
        System.out.println("SOLID Principles");


        // Liskov Substitution Principle (LSP)
        System.out.println("\n--- Liskov Substitution Principle (LSP) - Violated ---");
        ViolatedOrderExample.runExample();

        System.out.println("\n--- Liskov Substitution Principle (LSP) - Solved ---");
        SolvedOrderExample.runExample();


        // Open Closed Principle (OCP)
        System.out.println("\n--- Open Closed Principle (OCP) - Violated ---");
        ViolatedDiscountExample.runExample();

        System.out.println("\n--- Open Closed Principle (OCP) - Solved ---");
        SolvedDiscountExample.runExample();


        // Single Responsibility Principle (SRP)
        System.out.println("\n--- Single Responsibility Principle (SRP) - Violated ---");
        ViolatedOrderProcessor.runExample();

        System.out.println("\n--- Single Responsibility Principle (SRP) - Solved ---");
        SolvedOrderProcessor.runExample();


        System.out.println("\nEND OF PROGRAM");
    }
}
