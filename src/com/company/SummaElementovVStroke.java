package com.company;

import java.util.Random;

public class SummaElementovVStroke {

    public static void main(String[] args) {

        //Посчитать сумму элементов двухмерного массива в строке

        int[][] mas = new int[10][20];
        initMas(mas);
        printMas(mas);
        sumVStroke(mas);
    }

    public static void initMas(int[][] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = -50 + random.nextInt(100);
            }
        }
    }

    public static void printMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                System.out.printf("%5d", fmas[i][j]);
            }
            System.out.println();
        }
    }

    public static int sumVStroke(int[][] fmas) {
        int sum = 0;
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                sum = sum + fmas[i][j];
            }
            System.out.println(sum);
        }
    }

}
