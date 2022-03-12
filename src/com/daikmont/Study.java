package com.daikmont;

import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, times, i = 1;
        times = sc.nextInt();

        while (i <= times){
            b = sc.nextInt();
            a = sc.nextInt();
            int min = Math.min(a, b);
            System.out.println(min + " ");
            i++;
        }
    }

}
