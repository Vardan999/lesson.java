package com.company;

public class Classes {

    public static void main(String[] args) {


        class Quarter {
            private int widht;


            Quarter() {
                this.widht = 0;
            }

            Quarter(int arg) {
                this.widht = arg;
            }
            Quarter(int args,int args1) {

                this.widht = args + args1;
            }

            public int parr(int withd) {
                this.widht = withd;
//                int par = withd;
                return 4 * withd;
            }


            public void setWidht(int widht) {
                this.widht = widht;

            }

        }


        Quarter quarter1 = new Quarter();
        Quarter quarter2 = new Quarter(15,4);



        class Triangle {
            private int a;
            private int b;
            private int c;


            Triangle() {
                this.a = 0;
                this.b = 0;
                this.c = 0;
            }

            public int perimeter(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;

                int par = a + b + c;
                return par;
            }

            public void setParimetr(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }


        class WorkInfo {
            private int salary;
            private String name;
            private String lastName;
            private int birthYear;
            private String profesion;

            WorkInfo() {
                this.salary = 0;
                this.birthYear = 0;
                this.name = "No name";
                this.lastName = "No lastname";
                this.profesion = "No profesion";
            }


            public int calculaterAge(int birthYear) {
                this.birthYear = birthYear;
                int age = 2022 - birthYear;
                return age;
            }

            public String names(String name) {
                this.name = name;
                return name;
            }

            public String lastNames(String lastName) {
                this.lastName = lastName;
                return lastName;
            }

            public String profesions(String profesion) {
                this.profesion = profesion;
                return profesion;
            }

            public int salaryes(int salary) {
                this.salary = salary;
                return salary;
            }

        }


        class InfoAbout {
            private int birthNumber;
            private String name;
            private String lastName;


            InfoAbout() {
                this.birthNumber = 0;
                this.name = "No name";
                this.lastName ="No lastName";

            }

            public int calculaterAge(int birthNumber) {
                int year = 2022;
                int age = year - birthNumber;
                return age;

            }

            public String names(String name) {
                this.name = name;
                return name;
            }

            public String lastNames(String LastName) {
                this.lastName = lastName;
                return LastName;

            }

        }


        System.out.println(quarter1.parr(20));
        quarter1.setWidht(15);


        Triangle triangle1 = new Triangle();
        System.out.println(triangle1.perimeter(5, 5, 5));

        InfoAbout infoAbout1 = new InfoAbout();
        System.out.println("age: " + infoAbout1.calculaterAge(1999));
        System.out.println(infoAbout1.names("Vardan"));
        System.out.println(infoAbout1.lastNames("Khublaryan"));

        WorkInfo workInfo1 = new WorkInfo();
        System.out.println("age: " + workInfo1.calculaterAge(1999));
        System.out.println("name: " + workInfo1.names("Jone"));
        System.out.println("lastename: " + workInfo1.lastNames("Stounse"));
        System.out.println("profesion: " + workInfo1.profesions("footballer"));
        System.out.println("Salary: " + workInfo1.salaryes(9000) + " $");


    }
}