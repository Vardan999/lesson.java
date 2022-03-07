package com.company;

import java.time.Clock;

public class Classes2 {
    public static class Stack {
        int stck[] = new int[10];
        int toc;

        public Stack() {
            toc = -1;

        }


        public void push(int item, int[] stck) {
            if (toc == 9) {
                System.out.println("Array is full");
            } else {
                stck[++toc] = item;
            }

        }

        public int pop(int[] stck1) {
            if (toc < 0) {
                System.out.println("Array is underflow");
                return 0;
            }
            return stck1[toc--];
        }
    }


    public static class Clock {
        private int hours;
        private int minutes;
        private int seconds;


        public Clock() {
            int hourses = 12;
            int minutes = 0;
            int seconds = 0;
        }

        public Clock(int hour, int minute, int second) {
            this.hours = hour;
            this.minutes = minute;
            this.seconds = second;
        }

        public Clock(int times) {
            this.seconds = times;
            this.hours = times;
            this.minutes = times;
        }

        public void setClock(int times) {
            this.seconds = times;


        }

        public void setClock1(int hours) {
            this.hours = hours;


        }

        public void setClock2(int minutes) {
            this.minutes = minutes;


        }

        public int tick() {
            seconds += 1;
            return seconds;


        }


        public void addClock(int addSecond, int addMinutes, int addHours) {
            seconds += addSecond;
            minutes += addMinutes;
            hours += addHours;
        }

        public String byString(String hours, String minutes, String seconds) {

            String time = hours + minutes + seconds;
            return time;
        }

        public int tickDown() {
            seconds -= 1;
            return seconds;

        }

    }

    public static class ComplexNumber {
        double realPart;
        double imaginaryPart;

        public ComplexNumber() {
            realPart = 0;
            imaginaryPart = 0;
        }

        public ComplexNumber(double realPart, double imaginaryPart) {
            this.realPart = realPart;
            this.imaginaryPart = imaginaryPart;
        }

        public double complexAdd(double realPart, double imaginaryPart) {
            double sum1 = this.realPart + this.imaginaryPart;
            double sum2 = realPart + imaginaryPart;
            return sum1 + sum2;
        }

        public double complexSubtract(double realPart, double imaginaryPart) {
            double sum = realPart + imaginaryPart;
            double sum1 = this.imaginaryPart + this.realPart;
            return sum - sum1;
        }

        public double complexProdukt(double realPart, double imaginaryPart) {
            double sum = realPart + imaginaryPart;
            double sum1 = this.imaginaryPart + this.realPart;
            return sum * sum1;
        }

        public void setRealPart(double realPart) {
            this.realPart = realPart;

        }

        public void setImaginaryPart(double imaginaryPart) {
            this.imaginaryPart = imaginaryPart;

        }

        public double getImaginaryPart() {
            return imaginaryPart;
        }

        public double getRealPart() {

            return realPart;
        }
    }

    public static class Author {
        String firstName;
        String lastName;


        public Author(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setFirstname(String firstName) {
            this.firstName = firstName;

        }

        public void setLastname(String lastName) {
            this.lastName = lastName;

        }

        public String getLastName() {
            return lastName;
        }

        public String getFirstName() {

            return firstName;
        }

        public String toString() {
            return firstName;

        }

        public String toString1() {
            return lastName;
        }

    }

    public static class Book{
        public String title;
        public String author;
        public int price;


        Book(String title,String author,int price){
            this.title = title;
            this.price = price;
            this.author = author;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setPrice(int price){
            this.price = price;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public String getTitle(){
            return title;
        }

        public int getPrice(){
            return price;
        }
        public String toString(){
            return "This book was published in 1976 and is one of the best books in its genre";
        }
    }


    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.pop(new int[12]);
        stack.push(1, new int[15]);

        Clock clock = new Clock();
        Clock clock1 = new Clock(20, 14, 45);
        Clock clock2 = new Clock(50);


        System.out.println(clock2.byString("12:", "24:", "55"));
        System.out.println(clock2.tickDown());

        ComplexNumber complexNumber = new ComplexNumber();
        ComplexNumber complexNumber1 = new ComplexNumber(3, 0.6);
        System.out.println(complexNumber.complexAdd(1, 0.5));
        System.out.println(complexNumber1.complexAdd(2, 1.5));
        System.out.println(complexNumber1.complexSubtract(4, 0.7));
        System.out.println(complexNumber1.complexProdukt(2, 2.1));

        Author author = new Author("Vardan", "Khublaryan");
        author.setFirstname("Bob");
        author.setLastname("Marley");
        System.out.println(author.toString());
        System.out.println(author.toString1());
        System.out.println(author.getFirstName());
        System.out.println(author.getLastName());


        Book book = new Book("100 Years of Solitude","Garsia Markes",80 );
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPrice() + "$");
        System.out.println(book.toString());
    }

}


