package com.company;
import java.io.IOException;
public class loops {
    public static void main(String[] args) throws IOException {

        for (int i = 5; i <= 100; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    count++;
                }

            }
            if (count < 1) {
                System.out.println(i);
            }
        }

        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
        }

        for (int k = 0; k <= 100; k++) {
            if (k % 2 == 1) {
                System.out.println(k);
            }

        }
    }
}


