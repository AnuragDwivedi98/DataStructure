package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumOccuring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str = br.readLine();
            int freq[] = new int[str.length()];
            char maxChar = str.charAt(0);
            char minChar = str.charAt(0);
            int max, min;
            char string[] = str.toCharArray();
            for (int i = 0; i < string.length; i++) {
                freq[i] = 1;
                for (int j = i + 1; j < string.length; j++) {
                    if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                        freq[i]++;
                        string[j] = '0';
                    }
                }
            }
            max = min = freq[0];
            for (int i = 0; i < freq.length; i++) {
                if (min > freq[i] && freq[i] != '0') {
                    min = freq[i];
                    minChar = string[i];
                }
                if (max < freq[i]) {
                    max = freq[i];
                    maxChar = string[i];
                }



            }
            System.out.print("Maximum occurring character: " + maxChar);
        }
    }
}

//output
//        1
//        anurag
//        Maximum occurring character: a
