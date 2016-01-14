package com.company;

import java.util.Random;

public class SummaElementovVStroke {

    public static void main(String[] args) {

        //Посчитать сумму элементов двухмерного массива в строке

        int[][] mas = new int[10][20];
        initMas(mas);
        printMas(mas);
        //sumVStroke(mas);
        printOneMas(maxMas(mas));
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

    /*public static void sumVStroke(int[][] fmas) {
        int sum = 0;
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                sum = sum + fmas[i][j];
            }
            System.out.println("сумма элементов " + i + "-ой строки - " + sum);
        }
    }*/

    public static void printOneMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            //System.out.printf("%5d", fmas[i]);
            System.out.println(fmas[i]);
        }
        //System.out.println();
    }

    public static int[] maxMas(int[][] fmas) {
        int[] max = new int[fmas.length];
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                max[i] += fmas[i][j];
            }
        }
        return max;
    }

}
