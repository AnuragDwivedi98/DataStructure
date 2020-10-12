package com.company;

import java.util.Scanner;

public class AlphabeticOrderOfVowel {
    public static void main(String[] args) {
//        String str = "Anurag";
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0)
        {
            String str = in.next();
            if (areVowelAlphabetic(str) == true)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
    static boolean areVowelAlphabetic(String s)
    {
        int len = s.length();
        char c = (char)64;
        for(int i=0;i<len;i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
            {
                if(s.charAt(i) < c)
                    return false;
                else
                    c = s.charAt(i);
            }
        }
        return true;
    }
}
//output
//        2
//        anurag
//        No
//        aeiou
//        Yes