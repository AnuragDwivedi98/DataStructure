package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
//        int tc = sc.nextInt();
        while(tc-- > 0)
        {
            String text = br.readLine();
            solution obj = new solution();
            if(obj.isPalindrome(text))
                System.out.println("Palindrome");
            else
                System.out.println("Not palindrome");
        }
    }
}
class solution
{
    public boolean isPalindrome(String text)
    {
        String reverse = reverse(text);
        if(text.equals(reverse))
            return true;
        else
            return false;

    }
    public String reverse(String in){
        if(in == null || in.isEmpty())
            return in;
        return in.charAt(in.length()-1) + reverse(in.substring(0,in.length()-1));

    }
}
