package com.company;

import java.util.Scanner;

public class Specialpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1, c = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                if (num % j == 0)
                    c++;
            }
            if (c == 1)
                System.out.println(num++);
            System.out.println();
        }
    }
}

