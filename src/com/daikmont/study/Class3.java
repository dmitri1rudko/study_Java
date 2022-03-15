package com.daikmont.study;

import java.util.Scanner;

public class Class3 {
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

        double sum = 0;
        for (int i = 1; i>0; i++) {
            System.out.println("Введите число: ");
            int number = scanner.nextInt();
            if (number>0){
                number = i;
                sum += number;
            }else{
                System.out.println("Вы ввели 0 или отрицательное число");
                System.out.println("Кол-во введенных вами цифр :" + number);
                System.out.println("Сумма: " + sum);
                double am = sum/number;
                System.out.println("Средняя арифметическая: " + am);

                i = -1;
            }
        }
        System.out.println("Program ended");
    }
}
