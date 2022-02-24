package com.company;

import java.io.IOException;

public class methods {
    static int[] arr = {25, 4, 58, 12, 56, 5};

    public static int find(int numb) {
        for (int i = 0; i < 6; i++)
            if (arr[i] == numb) {
                numb = i;
            }
        return numb;
    }


    public static int reType(int value) {
        for (int i = 0; i < 6; i++) {
            arr[5] = value;
        }
        return value;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(find(12));
        System.out.println(reType(85));


    }
}








