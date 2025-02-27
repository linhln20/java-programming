package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PENNY_VALUE = 0.01;
        final double NICKEL_VALUE = 0.05;
        final double DIME_VALUE = 0.10;
        final double QUARTER_VALUE = 0.25;
        final double TARGET_AMOUNT = 1.00;

        System.out.print("Enter pennies coin: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter nickels coin: ");
        int nickels = scanner.nextInt();

        System.out.print("Enter dimes coin: ");
        int dimes = scanner.nextInt();

        System.out.print("enter quarters coin: ");
        int quarters = scanner.nextInt();

        scanner.close();

        double totalAmount = (pennies * PENNY_VALUE) + (nickels * NICKEL_VALUE) +
                (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE);

        if (totalAmount == TARGET_AMOUNT) {
            System.out.println("Congratulations! You have correctly entered $1.00 and won the game!");
        } else if (totalAmount > TARGET_AMOUNT) {
            System.out.printf("You have entered more than $1. You have a balance of $%.2f.\n", (totalAmount - TARGET_AMOUNT));
        } else {
            System.out.printf("You have entered less than $1. You have a missing $%.2f.\n", (TARGET_AMOUNT - totalAmount));
        }
    }
}

