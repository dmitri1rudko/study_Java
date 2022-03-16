package com.daikmont.study.class1;

import java.util.Scanner;

public class ClassCount {
    public static void main(String[] args) {
//        0 пока вы не напишите цифру ноль вы должны принимать цифры.
//        после того как вы пропишите ноль, вы должны вывести кол-во введенных вами чисел
//                (не считая ноль), вывести их сумму, также среднюю арифметическую
// Например:
// Введите число: 5
// Введите число: 4
// Введите число: 3
// Введите число: 2
// Введите число: 1
// Введите число: 0
// Кол-во введенных вами цифр : 5
// Сумма: 15
// Средняя арифметическая: 3.0
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = -1;
        for(int i = 0; i<1; i--){
            System.out.println("Enter number: ");
            int A = scanner.nextInt();
            sum = sum + A;
            count++;
            if(A<=0){
                i = 2;
                System.out.println("Кол-во введенных вами цифр :" + count);
                System.out.println("Сумма: " + sum);
            }
        }
    }
}