package chapter5;

import java.util.Scanner;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {
    static int requiredSalary = 25000;
    static int requiredScoreCredit = 700;
    static Scanner scanner = new Scanner(System.in);
    //So da biet
    public static void main(String args[]) {
        double salary = getSalary();
        int credit = getCredit();
        getCredit();
        scanner.close();
        boolean qualified = isUserQualified(salary, credit);
        notifyUser(qualified);
    }

    public static double getSalary() {
        System.out.println("Vui long nhap long cua ban:");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getCredit() {
        System.out.println("Vui long nhap diem credit cua ban:");
        int credit = scanner.nextInt();
        return credit;
    }

    public static boolean isUserQualified(double salary, int credit) {
        if (salary >= requiredSalary && credit >= requiredScoreCredit) {
        return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean qualified) {
        if (qualified) {
            System.out.println("Ban da duoc duyet");
        }
        else {
            System.out.println("Rat tiec ban khong duoc duyet");
        }
    }
}

