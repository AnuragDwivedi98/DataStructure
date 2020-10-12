package com.company;

public class MP {
    public boolean checkPrime(int num) {
        boolean isPrime = false;
        int check = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                check++;

        }
        if (check == 1)
            isPrime = true;

        return isPrime;
    }

    public MP(String num) {
        String temp = num;
        int arrIndex = 1;

        boolean[] checkArr = new boolean[num.length() + 1];
        checkArr[0] = checkPrime(Integer.parseInt(num));

        int number = Integer.parseInt(num);

        while (number != 0) {
            int digit = number % 10;
            checkArr[arrIndex] = checkPrime(digit);
            number /= 10;
            arrIndex++;
        }
        boolean checkMegaPrime = true;
        for (int check = 0; check < checkArr.length; check++) {
            if (checkArr[check] != true)
            {
                checkMegaPrime = false;
                break;
            }

        }
        if (checkMegaPrime == true)
            System.out.println(temp);
    }

    public static void main(String[] sd) {
        for (int i = 1; i <= 100; i++) {
            new MP(String.valueOf(i));
        }

    }
}
