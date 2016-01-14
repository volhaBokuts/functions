package com.company;

import java.util.Random;

public class MaxSumOfAllElements {

    public static void main(String[] args) { //сполняемая функция, public - доступна для всех,
        // static - можно вызвать метод сразу, без создания экземляра класса, void - ничего не возвращает

        /*В массиве сравить попарно (1 со 2, 1 с 3, 1 с 4 и тд) элементы и найти те 2,
        сумма которых максимальная.*/

        int[] mas = new int[10];

        initMas(mas); //(проинициализировать)
        printMas(mas); //(вывод)
        findMaxPair(mas); //(найти пару, сумма которых максимальна)

    }

    public static void initMas(int[] fmas) {
        Random random = new Random();
        for(int i = 0; i < fmas.length; i++) {
            fmas[i] = -50 + random.nextInt(100);
        }
    }

    public static void printMas(int[] fmas) {
        for(int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }

    public static void findMaxPair(int[] fmas) {
        if (fmas.length < 2) {
            System.out.println("Длина массива должна быть не меньше 2");
        }
        int sum = fmas[0] + fmas[1];
        int maxI1 = 0;
        int maxI2 = 0;
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas.length; j++) {
                if ((i != j) && (fmas[i] + fmas[j] > sum)) {
                    sum = fmas[i] + fmas[j];
                    maxI1 = i;
                    maxI2 = j;
                }
            }
        }
        System.out.println("i1=" + maxI1 + " i2=" + maxI2 + " sum=" + sum);

    }

}
