package com.company;

import java.io.IOException;

public class methods {
    public static int value(int i) {
        return i;
    }

    public static void main(String[] args) throws IOException {

        int a = value(10);
        int b = 0;
        for (int i = 0; i <= a; i++) {
            b += i;
        }
        System.out.println(b);


    }


}
