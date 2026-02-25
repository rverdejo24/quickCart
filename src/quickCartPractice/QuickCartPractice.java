package quickCartPractice;

import java.util.Scanner;

public class QuickCartPractice {
    // Method 1: Displays a greeting message
    public static void displayGreeting() {
        System.out.println("Welcome to QuickCart!");
        System.out.println("Let's compute your total for today’s purchase.\n");
    }

    // Method 2: Computes subtotal of two items
    // This method accepts two item prices and returns their sum.
    public static double computeSubtotal(double price1, double price2) {
        return price1 + price2; // sends subtotal value back to main()
    }

    // Method 3: Applies a 15% discount if subtotal >= 1000
    // Otherwise, returns the same subtotal.
    public static double applyDiscount(double subtotal) {
        double discount = 0;

        if (subtotal >= 1000) {
            discount = subtotal * 0.15; // 15% discount
            System.out.println("Discount applied: ₱" + String.format("%.2f", discount));
        } else {
            System.out.println("No discount applied.");
        }
        return subtotal - discount; // return the new total
    }

    // Method 4: Prints a short "thank you" message after checkout.
    public static void displayThankYou() {
        System.out.println("Thank you for your purchase!");
    }

    // Method 5: Prints a message if the total purchase exceeds P2,000.
    public static void checkFreebies(double total) {
        if (total > 2000) {
            System.out.println("You're eligible to collect a freebie! Please proceed to the counter and collect your freebie!");
            displayThankYou();
        } else {
            displayThankYou();
        }
    }

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Step 1: Call the greeting method
        displayGreeting();

        // Step 2: Ask for input prices
        System.out.print("Enter price of first item: ");
        double price1 = sc.nextDouble();

        System.out.print("Enter price of second item: ");
        double price2 = sc.nextDouble();

        // Step 3: Compute subtotal by calling the computeSubtotal() method
        double subtotal = computeSubtotal(price1, price2);
        System.out.println("Subtotal: ₱" + String.format("%.2f", subtotal));

        // Step 4: Apply discount using the applyDiscount() method
        double total = applyDiscount(subtotal);
        System.out.println("Total amount due: ₱" + String.format("%.2f", total));

        // Step 5: Check if the customer is eligible for a freebie
        checkFreebies(subtotal);

        // Close Scanner object
        sc.close();
    }
}