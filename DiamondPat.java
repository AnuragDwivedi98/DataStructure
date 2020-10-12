package com.company;

import java.util.Scanner;

public class DiamondPat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        for (int i = 0; i < s; i++)
        {
            for (int j = s-i; j > 0; j--)
                System.out.print(" ");
            for (int k = 0; k < (2*i+1); k++)
                System.out.print("*");
            System.out.println();

        }

    }
}
//output
//        5
//        *
//        ***
//        *****
//        *******
//        *********