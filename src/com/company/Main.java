package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int a = 13;
        int b = 5;

        System.out.println("сумма a и b равна " + sum(a, b));

    }

    /*public static int sum (int x; int y) {
        int z =  x + y;
        return z;
        System.out.println("go");
    }*/


    public static int sum (int x, int y) {
        if (x == 0 && y == 0) {
            return 0;
        }
        return x + y;
    }





}
