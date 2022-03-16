package com.daikmont.study.class1;

import java.util.Scanner;

//Примите 2 четных числа с консоли.
//        • Надо вывести квадрат цифр которые между ними(A < квадрат чисел > В).
//        • Мисалы: 10, 14
//        • Жооп:
//        11 * 11 = 121
//        12 * 12 = 144
//        13 * 13 = 169
// while
public class ClassWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        while(A<B){
            A = A + 1;
            sum = A * A;
            System.out.println(A + " * " + A + " = " + sum);
        }

    }
}
