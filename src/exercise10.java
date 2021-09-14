/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        System.out.printf("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        String item1 = scanner.nextLine();
        int newItem1 = Integer.parseInt(item1);

        System.out.printf("Enter the quantity of item 1: ");
        Scanner scanner4 = new Scanner(System.in);
        String quantity1 = scanner4.nextLine();
        int newQuant1 = Integer.parseInt(quantity1);

        System.out.printf("Enter the price of item 2: ");
        Scanner scanner1 = new Scanner(System.in);
        String item2 = scanner1.nextLine();
        int newItem2 = Integer.parseInt(item2);

        System.out.printf("Enter the quantity of item 2: ");
        Scanner scanner5 = new Scanner(System.in);
        String quantity2 = scanner5.nextLine();
        int newQuant2 = Integer.parseInt(quantity2);

        System.out.printf("Enter the price of item 3: ");
        Scanner scanner2 = new Scanner(System.in);
        String Item3 = scanner2.nextLine();
        int newItem3 = Integer.parseInt(Item3);

        System.out.printf("Enter the quantity of item 3: ");
        Scanner scanner6 = new Scanner(System.in);
        String quantity3 = scanner6.nextLine();
        int newQuant3 = Integer.parseInt(quantity3);

       double subtotal = ((newItem1*newQuant1) + (newItem2*newQuant2) + (newQuant2*newItem3));
      double tax = (subtotal * 0.055);
        double total = (tax + subtotal);
        System.out.printf("$%.2f", subtotal);
        System.out.printf("\n$%.2f",tax);
        System.out.printf("\n$%.2f",total);
    }
}