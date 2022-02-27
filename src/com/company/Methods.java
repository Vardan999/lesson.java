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
        for (short i = 6; i >= 0; i--)
            if (arr[i] == numb) {
                numb = i;
            }
        return numb;
    }

    //insert element

    public static int insert(int numb, int index) {
        for (int i = 5; i >= 0; i--){
           arr[index] = numb;

        }

        return numb;
    }

    //change 5 to 85

    public static int checkElement(int value) {
        for (int i = 0; i < 6; i++) {
            arr[2] = value;
        }
        return value;
    }

    public static short checkElement(short value1) {
        for (short i = 0; i < 6; i++) {
            arr[3] = value1;
        }
        return value1;
    }


    public static void main(String[] args) throws IOException {
        System.out.println(find(4));
        System.out.println(checkElement(7));
        System.out.println(find(56));
        System.out.println(checkElement((short) 1));
        System.out.println(insert(13163,0));

        for (int i = 0; i < 6; i++) {

            System.out.println(arr[i]);

        }

}
}








