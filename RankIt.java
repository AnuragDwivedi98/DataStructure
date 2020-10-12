package com.company;

import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class RankIt {
    public static void main(String args[] ) throws Exception {
        RankIt obj = new RankIt();
        Scanner s = new Scanner(System.in);
        int arrLen = s.nextInt();    s.nextLine();

        int ArrOfInt [] = new int[arrLen];

        for(int i=0;i <arrLen ; i++ ){

            ArrOfInt[i] = s.nextInt();
        }
        Arrays.sort(ArrOfInt);
        s.nextLine();
        int noOfquestions = s.nextInt(); s.nextLine();

        for(int j =0; j<noOfquestions ; j++){
            int search = s.nextInt();

            int print = obj.binarySearch1(ArrOfInt,search, 0,arrLen-1);
            System.out.println(print);
        }
    }

    public int binarySearch1(int []arr,int search, int min, int max){

        while(min <= max){

            int mid = max + min/2;

            if(search > arr[mid]){
                min = mid+1;
            }
            else if(search < arr[mid]){
                max = mid-1;
            }
            else{
                return mid+1;
            }
        }
        return -1;
    }


}
