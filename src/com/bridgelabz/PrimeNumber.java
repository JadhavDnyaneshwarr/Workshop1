package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number =>");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                break;
            }else{
                count++;
            }
        }
        if(count > 0){
            System.out.println("The entered number " + number + " is a Prime Number.");
        }else {
            System.out.println("The entered number " + number + " is not Prime Number.");
        }
    }
}
