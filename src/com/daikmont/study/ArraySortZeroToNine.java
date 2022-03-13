package com.daikmont.study;

class ArraySortZeroToNine {
    public static void main(String[] args) {
        int[] massive = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int i = massive.length - 1;
        while (i >= 0){
            int min = Math.min(i, massive.length);
            System.out.println(massive[i]);
            i--;
        }
    }
}