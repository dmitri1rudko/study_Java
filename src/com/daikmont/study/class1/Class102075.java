package com.daikmont.study.class1;
//WithoutSoul, [15.03.2022 21:50]
//        o Дайте 2 цифры через консоль (0 < A < B)
//        o Выведите сумму не четных цифр между A и B.
//        o Пример: 10 20
//        o Ответ: 75
//
//        WithoutSoul, [15.03.2022 21:51]
//        тоесть вам надо будет прибавлять цифры между А и В которые являются нечетными
import java.util.Scanner;

public class Class102075 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum = 0;
        for(int i = A; i<=B;i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }System.out.println(sum);
    }
}
