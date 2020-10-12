package com.company;

public class FrequencyOfString {
    public static void main(String[] args) {
        String str = "AreBhaiBhaiBhai";
        String pat = "Bhai";
        System.out.println(CountFreq(str, pat));
    }
    static int CountFreq(String str, String pat)
    {
        int M = pat.length();
        int N = str.length();
        int res=0;
        for(int i = 0; i <= N-M; i++)
        {
            int j;
            for(j = 0; j < M; j++)
            {
                if(str.charAt(i+j) != pat.charAt(j))
                {
                    break;
                }
            }
            if(j == M)
                res++;
                j=0;
        }
        return res;
    }
}
