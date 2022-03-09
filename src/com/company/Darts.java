package com.company;

import java.util.Random;

public class Darts {
    String participants;


    Darts() {
        this.participants = "No Team number";

    }

    public int firstPlayer() {
        Random points = new Random();
        int pooint =  points.nextInt(20,30);
        return pooint;
    }

    public int secondPlayer() {
        Random points = new Random();
        int pooint =  points.nextInt(30,40);
        return pooint;
    }

    public int thirdPlayer() {
        Random points = new Random();
        int pooint =  points.nextInt(40,50);
        return pooint;
    }

    public int fourthPlayer() {
        Random points = new Random();
        int pooint =  points.nextInt(50,60);
        return pooint;
    }


    public static void main(String[] args) {

        Darts teamOne = new Darts();
        Darts teamSecond = new Darts();
        Darts teamThird = new Darts();
        Darts teamFouth = new Darts();
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
        System.out.println("The winner of fourth team");
        System.out.println("fourth  player");
        System.out.println(teamFouth.fourthPlayer());
        System.out.println("the champion is fourth player of fourth team");


    }
}


