package com.company;

import java.util.Scanner;

public class ExactltThreeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            ExactltThreeDivisor obj = new ExactltThreeDivisor();
            System.out.println(obj.Divisor(N));
        }

    }

    public int Divisor(int N)
    {
        int i,j,c=0,res=0;
        for(i=1;i*i<N;i++)
        {
            c=0;
            for(j=1;j<=i;j++){
                if(i%j==0)
                    c++;
            }
            if(c==2)
                res++;

        }


        return res;

    }

}
