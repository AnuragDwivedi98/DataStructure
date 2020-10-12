package com.company;

import java.util.Scanner;

public class CheckForBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        while(tc-->0)
        {
            String b = sc.nextLine();
            CheckForBinary obj = new CheckForBinary();
            boolean bool = obj.isBinary(b);
            if(bool == true)
                System.out.println("Binary");
            else
                System.out.println("Not Binary");
        }
    }

    static boolean isBinary(String b)
    {
        for(char c: b.toCharArray())
        if(c != '0' && c!='1')
            return false;
        return true;
    }
}
//output
//        2
//        0101010
//        Binary
//        1122
//        Not Binary
