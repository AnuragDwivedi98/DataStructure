package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDuplicateWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int count;
            String str = br.readLine();
            str = str.toLowerCase();
            String words[] = str.split(" ");

            for(int i=0;i<words.length;i++) {
                count = 1;
                for (int j = i + 1; j < words.length; j++){
                    if(words[i].equals(words[j])){
                        count++;
                        words[j]="0";
                    }
                }
                if(count > 1 && words[i] != "0"){
                    System.out.println(words[i]);
                }

            }



        }
    }
}
//op
//        1
//        a n u r a g
//        a
