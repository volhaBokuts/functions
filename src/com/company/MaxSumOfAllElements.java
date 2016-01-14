package com.company;

import java.util.Random;

public class MaxSumOfAllElements {

    public static void main(String[] args) { //���������� �������, public - �������� ��� ����,
        // static - ����� ������� ����� �����, ��� �������� ��������� ������, void - ������ �� ����������

        /*� ������� ������� ������� (1 �� 2, 1 � 3, 1 � 4 � ��) �������� � ����� �� 2,
        ����� ������� ������������.*/

        int[] mas = new int[10];

        initMas(mas); //(�������������������)
        printMas(mas); //(�����)
        findMaxPair(mas); //(����� ����, ����� ������� �����������)

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
            System.out.println("����� ������� ������ ���� �� ������ 2");
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
