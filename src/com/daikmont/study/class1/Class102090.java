package com.daikmont.study.class1;

import java.util.Scanner;

public class Class102090 {
    public static void main(String[] args) {
//        WithoutSoul, [15.03.2022 21:52]
//        o Дайте 2 цифры через консоль (0 < A < B)
//        o Выведите сумму четных цифр между A и B
//
//        WithoutSoul, [15.03.2022 21:53]
//        например:
// 10 20
// Ответ:
// 10 12 14 16 18 20
// Сумма: 90
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        for (int i = A; i <= B; i++)  {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println("\n" + "Answer: " + sum);
    }
}
