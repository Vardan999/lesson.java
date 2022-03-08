package com.company;

import java.util.Random;

public class ClassDarts {
    String participants;


    ClassDarts() {
        this.participants = "No Team number";

    }

    public int firstPlayer() {
        Random points = new Random();
        return points.nextInt(60);

    }

    public int secondPlayer() {
        Random points = new Random();
        return points.nextInt(60);

    }

    public int thirdPlayer() {
        Random points = new Random();
        return points.nextInt(60);

    }

    public int fourthPlayer() {
        Random points = new Random();
        return points.nextInt(60);

    }




    public static void main(String[] args) {

        ClassDarts teamOne = new ClassDarts();
        ClassDarts teamSecond = new ClassDarts();
        ClassDarts teamThird = new ClassDarts();
        System.out.println("The winner of First team");
        System.out.println("first player");
        System.out.println(teamOne.firstPlayer());
//        System.out.println(teamOne.firstPlayer());
//        System.out.println(teamOne.firstPlayer());
        System.out.println("The winner of second team");
        System.out.println("third player");
        System.out.println(teamSecond.thirdPlayer());
//        System.out.println(teamSecond.thirdPlayer());
//        System.out.println(teamSecond.thirdPlayer());
        System.out.println("The winner of third team");
        System.out.println("second player");
        System.out.println(teamThird.secondPlayer());
//        System.out.println(teamThird.secondPlayer());
//        System.out.println(teamThird.secondPlayer());
        System.out.println();



    }
}


