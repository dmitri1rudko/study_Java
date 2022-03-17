package com.daikmont.study.class1;

import java.util.Random;

//        создайте массив типа int, заполните его рандомными элементами(числа от 0 до 100)
//        размер массива укажите самостоятельно по желанию)
//        элементы массива которые хранят в себе цифры выше 50
//        найдите их, выведите их сумму и среднюю арифметику


public class DZMassive {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(100);

        int[] massive = new int[size];
        int[] array = new int[size];
        int total = 0;
        int count = 0;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(100);
        }
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 50) {
                total = total + massive[i];
                count++;
            }
        }
        System.out.println("total: " + total);
        System.out.println("Среднее арифметическое: " + (double) total/count);
    }
}
