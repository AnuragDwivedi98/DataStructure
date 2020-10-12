package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PeakElement {
    public static void main(String[] args) throws IOException {
//        int arr[] = {10,20,30,15,5};
//        int n = arr.length;
//        PeakElement obj = new PeakElement();
//        System.out.println(obj.isPeak(arr,n));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            int num = Integer.parseInt(br.readLine()); //Length of Array
            String s= br.readLine(); //Input the number seperated by space
            int[] arr= new int[num];
            String[] s1 = s.split(" ");
            for(int i=0;i<num;i++)
            {
                arr[i]=Integer.parseInt(s1[i]);
            }
            PeakElement obj = new PeakElement();

            System.out.println(obj.isPeak(arr,num));

        }

    }
    static int isPeak(int arr[], int n)
    {
        return peakUntil(arr,0, n-1, n);
    }
    static int peakUntil(int arr[], int high, int low, int n)
    {
        int mid = low+(high-low)/2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1|| arr[mid+1] <= arr[mid]))
            return mid;

            // If middle element is not peak
            // and its left neighbor is
            // greater than it, then left half
            // must have a peak element
        else if(mid > 0 && arr[mid-1] > arr[mid])
            return peakUntil(arr,low,mid-1,n);
        else


            // If middle element is not peak
            // and its right neighbor
            // is greater than it, then right
            // half must have a peak
            // element
            return peakUntil(arr,mid+1,high,n);
    }
}
//output
//        2
//        7
//        1 2 3 4 7 4 3
//        4
//        5
//        45 56 77 88 90
//        4
