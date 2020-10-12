package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;

public class MissingCharacterInPanagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String str = br.readLine();
            System.out.println(new MissingPanagram().missing(str));
        }
    }
}

class MissingPanagram
{
    static String missing(String str)
    {
        boolean chatSet[] = new boolean[26];
        Arrays.fill(chatSet, false);
        for(int i = 0;i < str.length(); i++){
            if(str.charAt(i) >= 65 && str.charAt(i) <=92)
                chatSet[str.charAt(i)-'A'] = true;
            else
                chatSet[str.charAt(i)-'a'] = true;
        }
        String res = "";
        for (int i = 0; i < 26; i++){
            if(chatSet[i] == false)
                res += (char)(i+97);
        }
        return (res == "" ? "-1" : res);
    }
}
//output
//        2
//        anurag
//        bcdefhijklmopqstvwxyz
//        abc
//        defghijklmnopqrstuvwxyz