package com.company;

import java.util.Scanner;

public class DigitsInFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            DigitsInFactorial obj = new DigitsInFactorial();
            System.out.println(obj.Factorial(N));
        }
    }

    int Factorial(int N)
    {
        if(N<0)
            return 0;
        if(N<=1)
            return 1;
        double digit = 0;
        for(int i=2;i<=N;i++){
            digit+=Math.log10(i);
        }
        return (int) Math.floor(digit)+1;
    }
}

//output:
//        1
//        5
//        3
