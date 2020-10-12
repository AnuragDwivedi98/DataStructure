package com.company;

import java.util.Scanner;

public class SubArraySum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }

            Subarray obj = new Subarray();
            obj.subarraySum(n, m, s);
            System.out.println();
        }
    }
}
class Subarray
{
    static void subarraySum(int n, int arr[], int s){
        for(int start = 1; start < arr.length; start++)
        {
            // initialize the sum of the current subarray to 0.
            int currSum = 0;
            for(int end = start; end < arr.length; end++)
            {
                // add every element of the current subarray
                // to the current running sum.
                currSum += arr[end];

                // print the starting and ending indices once we get
                // subarray with given sum
                if(currSum == s)
                    System.out.println("starting index : " +
                            start + ", " + "Ending index : " + end);



            }
        }
    }
}
