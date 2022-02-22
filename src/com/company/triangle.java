package com.company;

import java.io.IOException;

public class triangle {


    public static void main(String[] args) throws IOException {

        //havasarakoxm erankyun

        int a = 18;
        int b = 18;
        int c = 22;

        if (a == b & b == c) {
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

        if (a == b || b == c) {
            System.out.println(true);
        } else if (c == a) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // 2 erankyunneri havasarutyan haytanish
        //erankyun(2)
        int d = 3;
        int e = 4;
        int f = 5;

        if (a == d & b == e & c == f) {
            System.out.println(true);
        } else {

            System.out.println(false);
        }

        //erankyun 3
        int g = 20;
        int h = 20;
        int j = 20;

        if ((g & h) == j) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (g == h || h == j) {
            System.out.println(true);
        } else if (g == j) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if ((g * g) + (h * h) == (j * j)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // հավասարակողմ եռանկյան պարագիծ
        int aa = 18;
        int bb= 18;
        int cc = 18;

        int p = a + b + c;

        System.out.println(p);

        //  Ուղանկյուն եռանկյան Մակերես
        int dd = 5;
        int ee = 4;
        int ff = 3;

        int s = (e * f) / 2;

        System.out.println(s);
        //բարձրություն
        int hh = (e * f) / d;
        System.out.println(h);


    }
}
