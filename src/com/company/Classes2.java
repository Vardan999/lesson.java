package com.company;

public class Classes2 {
    static class Stack {
        int stck[] = new int[10];
        int toc;

        Stack() {
            toc = -1;

        }


        void push(int item, int[] stck) {
            if (toc == 9) {
                System.out.println("Array is full");
            } else {
                stck[++toc] = item;
            }

        }

        int pop(int[] stck1) {
            if (toc < 0) {
                System.out.println("Array is underflow");
                return 0;
            }
            return stck1[toc--];
        }
    }

        public static void main(String[] args) {

            Stack stack = new Stack();
             stack.pop(new int[12]);
            stack.push(1, new int[15]);


        }

}


