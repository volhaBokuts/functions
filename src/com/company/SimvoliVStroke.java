package com.company;

public class SimvoliVStroke {

    public static void main(String[] args) {

        //Посчитать процентное соотношение прописных и строчных символов в строке

        String Stroka = new String("Произвольная строка");
        int dlinaStroki = Stroka.length();

        float kolPropisnix = 0;
        float kolStrochnix = 0;

        for (int i = 0; i < dlinaStroki; i++) {
            if (Stroka.charAt(i) >= 'а' && Stroka.charAt(i) <= 'я') {
                kolStrochnix += 1;
            }
            else if (Stroka.charAt(i) >= 'А' && Stroka.charAt(i) <= 'Я') {
                kolPropisnix += 1;
            }
        }

        System.out.println("Процентное соотношение прописных букв в строке = " + kolPropisnix/dlinaStroki*100 + "%");
        System.out.println("Процентное соотношение строчных букв в строке = " + kolStrochnix/dlinaStroki*100 + "%");

    }

}
