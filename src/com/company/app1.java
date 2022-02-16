package com.company;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class app1 {
    public static void main(String[] args) throws IOException {


        char ch, answer = 'c';
        System.out.println("What is number");
        System.out.print("Your answer:");

        ch = (char) System.in.read();
        if (ch == answer) System.out.println("congregation!!");
        else if (ch != answer) {
            System.out.println("missing");
        }

        int a = 44;
        int b = 52;
        int c = 57;
        int d = 35;

        if((a+b) < (c+d)){
            System.out.println("it is a true");
        }else if ((a+b) == (c+d)){
            System.out.println("its a false");
        }else {
            System.out.println(false);
        }

        int h = 41;

        switch (h){
            case 1 :
                System.out.println(false);
                break;
            case 2 :
                System.out.println(false);
                break;
            case 3:
                System.out.println(false);
                break;
            case 4 :
                System.out.println(false);
                break;
            case 5:
                System.out.println(true);
                break;
            default:
                System.out.println("it is not available");

        }


        Stack<Number> arr = new Stack<Number>();
        arr.push(0);
        arr.push(1);

        for (int i = 1; i <= 15; i++) {
            arr.push((int) arr.get(i) + (int) arr.get(i - 1));
        }
        System.out.println(arr);

    }
}
