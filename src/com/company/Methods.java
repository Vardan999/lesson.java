package com.company;

import java.io.IOException;

public class Methods {
    static int[] arr = {25, 4, 58, 12, 56, 5};
    //Methods b = new Methods();



    //find the index

    public static int find(int numb, int[] array) {
        for (int i = 0; i < 6; i++)
            if (arr[i] == numb) {
                return i;
            }
        return numb;
    }

    //find the index

    public static short find(short numb, short[] array) {
        for (short i = 6; i >= 0; i--)
            if (arr[i] == numb) {
                return i;
            }
        return -1;
    }

    //insert element

    public static int replaceElement(int numb, int index, int[] array) {
        for (int i = 5; i >= 0; i--) {
            arr[index] = numb;

        }

        return numb;
    }

    //replace 5 to 85

    public static int replaceElement(int value, int[] array) {
        for (int i = 0; i < 6; i++) {
            arr[2] = value;
        }
        return value;
    }

    public static short replaceElement(short value1, short[] array) {
        for (short i = 0; i < 6; i++) {
            arr[3] = value1;
        }
        return value1;
    }



    public static void main(String[] args) throws IOException {
        System.out.println(find(4, arr));
        System.out.println(replaceElement(7, arr));
        System.out.println(find(1556, arr));
        System.out.println(replaceElement((short) 1, arr));
        System.out.println(replaceElement(20000, 4, arr));

        for (int i = 0; i < 6; i++) {

            System.out.println(arr[i]);




        }

    }

}








