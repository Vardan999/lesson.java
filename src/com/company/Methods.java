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



//change 5 to 85
    public static int reType( int value) {
        for (int i = 0; i < 6; i++) {
            arr[5] = value;
        }
         return value;
    }


    public static void main(String[] args) throws IOException {

        System.out.println(find(4));
        System.out.println(reType(88));

        for (int i = 0; i < 6; i++){


            System.out.println(arr[i]);
        }






    }
}








