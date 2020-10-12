package com.company;

//Write a program to find whether a number is Gandhi number or not.
//If the sum of fourth power of individual digits of a number is equal
//to the number itself, then it is called Gandhi number.

import java.util.Scanner;

public class GandhiNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextInt();
        long temp = num;
        long sum = 0;
        while (temp > 0) {
            sum += Math.pow(temp % 10, 4);
            temp /= 10;
        }
        if (sum == num) System.out.println("It is a Gandhi Number.");
        else System.out.println("It is not a Gandhi Number.");
    }
}

