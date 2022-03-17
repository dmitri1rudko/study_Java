package com.daikmont.study.class1;

import java.util.Random;
import java.util.Scanner;

public class vcv {
    public static void main(String[] args) {
//        int size=10;
//        int[] massiv = new int[size];
//        Random random = new Random();
//
//        for (int i = 0; i < size; i++) {
//            massiv[i] = random.nextInt(50);
//        }
//        for (int i = 0; i < size; i++) {
//            System.out.println(massiv[i]);
//        }
        Random random = new Random();
        int size = random.nextInt(30);
        int[] massiv = new int[size];
        for (int i = 0; i < massiv.length-1; i++) {
            massiv[i] = random.nextInt(300);
        }
        for (int i = 0; i < massiv.length-1 ; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println(massiv.length);

    }
}
