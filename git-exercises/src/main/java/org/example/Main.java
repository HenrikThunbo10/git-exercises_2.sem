package org.example;

public class Main {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        int numberMax = 101;

        for (int i = 0; i < numberMax; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else
                System.out.println(i);
        }
    }

}


