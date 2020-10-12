package com.company;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int space = size-1;
        for(int i=0;i<size;i++)
        {
            for (int j=0;j<space;j++)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
            space-=1;
        }
        space=0;
        for (int i=size;i>0;i--)
        {
            for (int j=0;j<space;j++)
                System.out.print(" ");
            for (int j=0;j<i;j++)
                System.out.print("* ");
            System.out.println();
            space++;
        }
    }
}
