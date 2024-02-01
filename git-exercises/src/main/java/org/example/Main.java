package org.example;

public class Main {
    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        printNr1To100();
    }

    public static void printNr1To100() {

        int maxValue = 101;

        for (int i = 0; i < maxValue; i++) {

            if (i % 5 == 0 && i % 3 == 0) {

                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {

                System.out.println("Buzz");
            } else if (i % 3 == 0) {

                System.out.println("Fizz");
            } else

                System.out.println(i);


        }
    }
}
