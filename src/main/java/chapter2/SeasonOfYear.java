package chapter2;

import java.util.Scanner;

public class SeasonOfYear {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the season of the year: ");
        String season = scanner.next();

        System.out.println("Enter a whole number: ");
        int num = scanner.nextInt();

        System.out.println("Enter an adjective: ");
        String adv = scanner.next();
        scanner.close();

        System.out.println("On a " + adv +" "+ season +" day, I drink a minimum of " + num +" cups of coffee.");
    }
}
