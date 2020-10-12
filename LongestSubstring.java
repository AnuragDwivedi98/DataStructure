package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-->0)
        {
            String str = br.readLine();
            int len = isLongest(str);
            System.out.println(len);
        }
    }
    static int isLongest(String s)
    {
        int n = s.length();
        int res=0;
        for (int i = 0; i < n; i++)
        {
            boolean visit[] = new boolean[256];
            for (int j = i; j < n; j++)
            {
                if(visit[s.charAt(j)] == true)
                    break;
                else
                    res = Math.max(res, j-i+1);
                    visit[s.charAt(j)] = true;

            }
            visit[s.charAt(i)] = false;
        }
        return res;
    }
}

//output
//        1
//        anurag
//        5