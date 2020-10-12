package com.company;

import java.util.Scanner;

public class BracketReversal {
    public static void main(String[] args) {
//        String exp = "{{{{}}}}";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String exp = sc.next();
            if (countReversal(exp) == -1)
                System.out.println("The given expression can not be balanced.");
            else
                System.out.println(countReversal(exp));

        }
    }
        static int countReversal (String exp)
        {
            int len = exp.length();
            if (len % 2 != 0)
                return -1;
            int res = 0, o = 0, c = 0;
            for (int i = 0; i < len; i++) {
                if (exp.charAt(i) == '{')
                    o++;
                else if (o == 0)
                    c++;
                else
                    o--;
            }
            res = (o / 2) + (c / 2);

            c = c % 2;
            o = o % 2;
            if (c != 0)
                res += 2;
            return res;
        }

}
//output
//        2
//        {{}}{}}{
//        2
//        {}{}{{}}
//        0
