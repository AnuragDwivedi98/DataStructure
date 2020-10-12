package com.company;

import java.util.Scanner;

public class PrimePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int c=2;
        for(int i=0;i<=size;i++)
        {
            for(int j=0;i<i;j++)
                while (!isPrime(c)) {
                    c++;
                }
                System.out.print(c);
                c++;
            System.out.println();
        }

    }
    static boolean isPrime(int c)
    {
        int p=1;
        for(int i=2;i<=(c/2);i++)
            if(c%i==0) {
                p = 0;
                break;
            }
        if(p==1||p==2)
            return true;
        else
            return false;
    }
}
