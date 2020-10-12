package com.company;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-->0)
        {
            String str = sc.next();
            Reverse obj = new Reverse();
            obj.reverse(str);
            System.out.println();
        }
    }
}
class Reverse
{
    static void reverse(String str)
    {
        String[] s=str.split("\\.");
        for(int i=s.length-1;i>0;i--)
        {
            System.out.print(s[i]+".");
        }
        System.out.print(s[0]);
    }
}
