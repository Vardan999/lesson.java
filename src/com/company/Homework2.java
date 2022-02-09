package com.company;

import java.io.IOException;

public class Homework2 {

    public static void main(String[] args) throws IOException {

        //havasarakoxm erankyun

        int a = 18;
        int b = 18;
        int c = 22;

        if ((a & b) == c) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //uxankyun erankyun

        if ((a * a) + (b * b) == (c * c)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //havasarasrun erankyun

        if (a == b || b == c ){
            System.out.println(true);
        }else if (c == a){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        // 2 erankyunneri havasarutyan haytanish
        //erankyun(2)
        int d = 3;
        int e = 4;
        int f = 5;

        if (a == d & b == e & c == f){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
