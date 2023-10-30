package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void count(int n) {
        if (n <= 0) {
            return;
        } else {
            count(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter a positive integer: (or enter 0 to exit)");
                int input = scanner.nextInt();
                if (input == 0) {
                    validInput = true;
                } else if (input > 0) {
                    count(input);
                } else {
                    System.out.println("Invalid input.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. ");
                scanner.next();
            }
        }
        scanner.close();
    }
}



