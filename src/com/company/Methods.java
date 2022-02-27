package com.company;

import java.io.IOException;

public class Methods {
    static int[] arr = {25, 4, 58, 12, 56, 5};

    //find the index

    public static int find(int numb) {
        for (int i = 0; i < 6; i++)
            if (arr[i] == numb) {
                numb = i;
            }
        return numb;
    }

    //find the index

    public static short find(short numb) {
        for (short i = 5; i >= 0; i--)
            if (arr[i] == numb) {
                numb = i;
            }
        return numb;
    }

    //insert element

    public static int insert(int numb, int index) {
        for (short i = 5; i >= 0; i--)
            if (arr[i] == numb) {
                arr[i] = index;
            }
        return numb;
    }


    //change 5 to 85

    public static int checkElement(int value) {
        for (int i = 0; i < 6; i++) {
            arr[5] = value;
        }
        return value;
    }

    public static short checkElement(short value) {
        for (short i = 0; i < 6; i++) {
            arr[5] = value;
        }
        return value;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(find(4));
        System.out.println(checkElement(88));
        System.out.println(find(56));
        System.out.println(checkElement(74));
        System.out.println(insert(99, 0));

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }


    }
}








