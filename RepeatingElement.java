package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatingElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            long n = Long.parseLong(br.readLine());
            long arr[] = new long[(int) n];
            String input[] = br.readLine().trim().split(" ");
            for(int i=0;i<n;i++)
                arr[i] = Long.parseLong(input[i]);
            Repeat obj = new Repeat();
            obj.isRepeat(arr, n);
        }
    }
}
class Repeat
{
    static void isRepeat(long arr[], long n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.print(arr[i]+" ");
                }
            }
        }

    }
}
