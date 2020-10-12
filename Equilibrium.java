package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc --> 0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String InputLine[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
            {
                arr[i] = Long.parseLong(InputLine[i]);
            }
            Equi obj = new Equi();
            System.out.println(obj.point(arr, n));


        }
    }
}
class Equi
{
    static int point(long arr[], int n)
    {
        long lsum, rsum;
        for(int i = 0; i < n; i++)
        {
            lsum = 0;
            for(int j=0;j<i;j++)
                lsum+=arr[j];
            rsum = 0;
            for(int j= i+1;j<n;j++)
                rsum+=arr[j];
            if(lsum == rsum)
                return i;
        }
        return -1;
    }
}
//output:
//        2
//        5
//        1 3 4 2 2
//        2
//        7
//        1 1 2 3 4 5 2
//        4