package com.company;

import java.util.Random;

public class MaxSumOfElments {

    public static void main(String[] args) { //сполн€ема€ функци€, public - доступна дл€ всех,
    // static - можно вызвать метод сразу, без создани€ экземл€ра класса, void - ничего не возвращает

        int[] mas = new int[10];

        initMas(mas); //(проинициализировать)
        printMas(mas); //(вывод)
        findMaxPair(mas); //(найти пару, сумма которых максимальна)

    }

    public static void initMas(int[] fmas) {
        Random random = new Random();
        for(int i = 0; i < fmas.length; i++) {
            fmas[i] = random.nextInt(100);
        }
    }

    public static void printMas(int[] fmas) {
        for(int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }

    public static void findMaxPair(int[] fmas) {
        if (fmas.length < 2) {
            System.out.println("ƒлина массива должна быть не меньше 2");
        }
        int sum = fmas[0] + fmas[1];
        int maxI1 = 0;
        int maxI2 = 0;
        for (int i = 0; i < fmas.length - 1; i++) {
            if (fmas[i] + fmas[i + 1] > sum) {
                sum = fmas[i] + fmas[i + 1];
                maxI1 = i;
                maxI2 = i + 1;
            }
        }
        System.out.println("i1=" + maxI1 + " i2=" + maxI2 + " sum=" + sum);

    }

}
