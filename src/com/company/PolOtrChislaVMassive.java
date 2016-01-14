package com.company;

import java.util.Random;

public class PolOtrChislaVMassive {

    public static void main(String[] args) {

        int[] mas = new int[10];

        printMas(mas);
        initMas(mas);
        printMas(mas);

        System.out.println("Процентное соотношение положительных чисел в массиве = " + procent(skolkoPol(mas),mas.length) + "%");
        System.out.println("Процентное соотношение отрицательных чисел в массиве = " + procent(skolkoOtr(mas),mas.length) + "%");

    }

    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }

    public static void initMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = (new Random()).nextInt(40)-20;
        }
    }

    public static int skolkoPol(int[] fmas) {
        int c = 0;
        for (int i = 0; i < fmas.length; i++) {
            if (fmas[i] >= 0 ) {
                c++;
            }
        }
        return c;
    }

    public static int skolkoOtr(int[] fmas) {
        int c = 0;
        for (int i = 0; i < fmas.length; i++) {
            if (fmas[i] < 0 ) {
                c++;
            }
        }
        return c;
    }

    public static float procent(float x, float y) {
        return x / y * 100;
    }

}
