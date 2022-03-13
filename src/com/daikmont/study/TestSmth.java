package com.daikmont.study;

class Maths {
    public int maxFinder(int a, int b) {
        a = a + b;
        return a;
    }
}

public class TestSmth {
    public static void main(String[] args) {
        Maths maths = new Maths();
        System.out.println(maths.maxFinder(2,5));
    }
}
