package com.company;
import java.io.IOException;
import java.util.Scanner;

public class app1 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[]{1, 45, 25, 6};
        System.out.println(array[3] + array[2]);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        char ch, answer = 'c';
        System.out.println("What is number");
        System.out.print("Your answer:");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("congregation!!");
        else if (ch != answer) {
            System.out.println("missing");
        }
    }
}


