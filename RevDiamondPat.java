package com.company;

import java.util.Scanner;

public class RevDiamondPat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = size; i != 0; i--)
        {
            for(int j = 0; j < size-i; j++)
            {
                System.out.print(" ");
            }
            for(int k = 00; k < (2*i - 1); k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

