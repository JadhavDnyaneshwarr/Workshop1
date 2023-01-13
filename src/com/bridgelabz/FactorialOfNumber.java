package com.bridgelabz;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =>");
        int number = scanner.nextInt();
        int factorialOfNumber = 1;
        for (int i = 1; i <= number; i++){
            factorialOfNumber *= i;
        }
        System.out.println(factorialOfNumber);
    }
}
