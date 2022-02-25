package com.company;
import java.io.IOException;

public class Arrays {
    public static void main(String[] args) throws IOException {


        int w = 0;
        for (int i = 1; i <= 100; i++) {
            w += i;
        }
        System.out.println(w);


        int e = 0;
        for (int i = 1; i <= 40; i++) {
            e += i;
        }
        System.out.println(e);


        int[] mas = {45, 12, 8, 78, 6, 58};
        int x = mas[0];

        for (int i = 0; i < 6; i++) {
            if (mas[i] < x) {
                x = mas[i];
            }
        }
        System.out.println(x);


        int[] arr = {45, 12, 8, 78, 6, 58};
        int z = arr[0];

        for (int i = 1; i < 6; i++) {
            if (arr[i] > z) {
                z = arr[i];
            }
        }
        System.out.println(z);


        for (int i = 1; i < 6; i++) {
            int j = i;
            while (j != 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }


        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }


        for (int i = 1; i < 6; i++) {
            int j = i;
            while (j != 0 && arr[j] > arr[j - 1]) {
                arr[j] += arr[j - 1];
                arr[j - 1] = arr[j] - arr[j - 1];
                arr[j] = arr[j] - arr[j - 1];
                j--;
            }
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);


        }


    }
}
