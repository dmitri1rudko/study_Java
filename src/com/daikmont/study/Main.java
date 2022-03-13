package com.daikmont.study;
import java.util.*;

public class Main {

    static int actual;
    static int minus;
    static int add;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, how many chick in your farm? ");
        actual = sc.nextInt();
        condition();
    }

    public static void condition() {
        System.out.println("What do you want to do, add or minus some? ");
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        if (str.equals("add")){
            add_chicks(); // Вот здесь //
        }else if(str.equals("minus")){
            minus_chicks(); // Вот здесь //
        }else {
            print_actual();
        }
    }

    private static void print_actual() {
        System.out.println(actual);

    }

    public static void add_chicks() {
        System.out.println("How many chicken do you want add? ");
        Scanner sc2 = new Scanner(System.in);
        add = sc2.nextInt();
        int total_add = actual + add;
        System.out.println("Now you have " + total_add);
    }

    public static void minus_chicks() {
        System.out.println("How many chicken do you want minus? ");
        Scanner sc3 = new Scanner(System.in);
        minus = sc3.nextInt();
        int total_minus = actual - minus;
        System.out.println("Now you have " + total_minus);
    }


}