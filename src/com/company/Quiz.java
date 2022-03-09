package com.company;

public class Quiz {

    float averageArithmetic(float arr[]) {
        float count = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            count = arr[i] + count;
        }
        return count / arr.length;
    }

    //2
    int maxNumb(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        }
        if (b > a && b > c && b > d) {
            return b;
        }
        if (c > a && c > b && c > d) {
            return c;
        }
        return d;
    }

    //3
    int maxNum(int[] arr) {
        int x = arr[0];
        for (int i = 1; i < 6; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }
        return x;
    }
    //4
    int secondMax(int[] arr) {
        for (int i = 1; i < 6; i++) {
                int j = i;
                while (j != 0 && arr[j]> arr[j-1]){
                arr[j] = arr[j] + arr[j-1];
                arr[j-1] = arr[j] - arr[j-1];
                arr[j] = arr[j] - arr[j-1];
                j--;
                }
            }
        return arr[1];
        }


    public static void main(String[] args) {

        float[] arr = {5.50F, 2.22f, 3.10f};


        int[] arrr = new int[]{45, 12, 8, 78, 6, 58};
        Quiz quiz = new Quiz();
        System.out.println(quiz.maxNumb(2, 3, 4, 5));
        System.out.println(quiz.maxNum(arrr));
        System.out.println(quiz.averageArithmetic(arr));
        System.out.println(quiz.secondMax(arrr));
    }
}
