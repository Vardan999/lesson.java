package com.company;

import java.io.IOException;

public class matrix {
    public static void main(String[] args) throws IOException {
        int twoD[][] = new int[3][4];
        int i, j, k = 0;

        for (i = 0; i < 3; i++)
            for (j = 0; j < 4; j++) {
                twoD[i][j] = k;
                k++;
            }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++)

                System.out.print(twoD[i][j] + " ");
            System.out.println();
        }


        int minValue = twoD[0][0];
        for (i = 1; i < 3; i++)
            for (j = 1; j < 4; j++) {
                if (twoD[i][j] < minValue) {
                    twoD[i][j] = minValue;

                }
            }
        System.out.println(minValue);


        int maxValue = twoD[0][0];

        for (i = 1; i < 3; i++)
            for (j = 1; j < 4; j++) {
                if (twoD[i][j] > minValue) {
                    maxValue = twoD[i][j];
                }
            }
        System.out.println(maxValue);
    }


}








