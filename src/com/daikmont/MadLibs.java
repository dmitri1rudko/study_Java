package com.daikmont;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a season of a year:");
        String _season_of_a_year = scanner.next();
        System.out.println("Enter a whole number:");
        int _day_of_a_month = scanner.nextInt();
        System.out.println("Enter an adjective:");
        String _adjective = scanner.next();
        scanner.close();
        System.out.println("On a " + _adjective + " " +  _season_of_a_year +
                " day, I drink a minimum of " + _day_of_a_month +
                " cups of coffee.");
    }
}