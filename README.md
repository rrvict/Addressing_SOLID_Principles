# Addressing_SOLID_Principles
 CPRO 2221 A - Assignment 2

 ==================================================

Student Name: Robert Louiz Victoriano

==================================================

Use Case: Order Processing System

Description: The idea is that the Order Processing System is responsible for managing orders. The system allows creating orders, applying discounts based on order types, and generating invoices. I have decided to go with the following SOLID Principles for demonstration:

* Liskov Substitution Principle (LSP)
* Open Closed Principle (OCP)
* Single Responsibility Principle (SRP)

Principles and their Importance (I just grabbed these from our class materials):

1. Liskov Substitution Principle (LSP)
Definition: Subtypes must be substitutable for their base types without altering the correctness of the program.
Importance: Ensures that the derived classes do not break the functionality expected by the base class, allowing for better extensibility and reliability.

2. Open Closed Principle (OCP)
Definition: Classes should be open for extension but closed for modification.
Importance: Promotes code that can accommodate new functionality without altering existing code, reducing the risk of introducing bugs.

3. Single Responsibility Principle (SRP)
Definition: A class should have only one reason to change, meaning it should have only one responsibility.
Importance: Simplifies code, making it easier to understand, test, and maintain.

Implementation Scenarios:

1. Liskov Substitution Principle (LSP):

Violated Scenario:
A StandardOrder and SpecialOrder class inherit from the Order class.
SpecialOrder overrides the processOrder() method to throw an exception in some cases, breaking the substitutability of SpecialOrder in place of Order.

Refactored Scenario:
Both StandardOrder and SpecialOrder implement the Order interface. Specific behavior is encapsulated, ensuring substitutability.

2. Open Closed Principle (OCP):

Violated Scenario:
The DiscountCalculator class uses an if-else structure to calculate discounts for different order types.
Adding a new order type requires modifying the DiscountCalculator class.

Refactored Scenario:
Introduce a DiscountStrategy interface and create separate classes for each order type. The DiscountCalculator uses the strategy pattern to calculate discounts without modification.

3. Single Responsibility Principle (SRP):

Violated Scenario:
The Order class handles order creation, discount calculation, and invoice generation.
Multiple responsibilities make the class harder to maintain and test.

Refactored Scenario:
Separate responsibilities into OrderManager, DiscountCalculator, and InvoiceGenerator classes.
