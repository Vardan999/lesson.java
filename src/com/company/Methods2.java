package com.company;

import java.io.IOException;

public class Methods2 {

    public static int fibonachi(int fib) {

        if (fib == 1 || fib == 2) {
            return 1;
        }

        return fibonachi(fib - 1) + fibonachi(fib - 2);
    }








    public static void main(String[] args) throws IOException {
       // for (int i = 1; i <= 10; i++)
            System.out.println(fibonachi(5));

           }
}

