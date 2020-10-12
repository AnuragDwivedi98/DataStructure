package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImmidiateSmaller {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-->0)
        {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String input[] = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(input[i]);
            int x = Integer.parseInt(br.readLine());
            System.out.println(immediate(arr,n,x));

        }
    }
    static int immediate(int arr[], int n, int x)
    {
        int res=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i] < x)
            {
                res = Math.max(res, arr[i]);
            }
        }
        return res;
    }
}
