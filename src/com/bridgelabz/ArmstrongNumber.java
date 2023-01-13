package com.bridgelabz;

import java.util.Scanner;

public class ArmstrongNumber {
    static int length(int number){
        int length = 0;
        while (number != 0) {
            int reminder = number % 10;
            number = number / 10;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =>");
        int number = scanner.nextInt(); //343
        int fixNumber = number;
        int length = length(number);
        int sum = 0;
        while (number != 0) {
            int reminder = number % 10;
            number = number / 10;
            sum += Math.pow(reminder, length);
        }
        if (fixNumber == sum){
            System.out.println("The enter number is a Armstrong Number");
        }else {
            System.out.println("The enter number is not Armstrong Number");
        }
    }
}
