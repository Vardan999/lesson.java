package com.company;

public class Recursion {
    public static int fibonaci(int fib) {
        if (fib == 1 || fib == 2) {
            return 1;
        }

        return fibonaci(fib - 1) + fibonaci(fib - 2);

    }



    public static int factorial(int fac) {
        if (fac <= 1) {
            return 1;
        }
        return fac * factorial(fac - 1);
    }



    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(fibonaci(i));
        }
        System.out.println("factorial of 4: " + factorial(4));


    }
}


