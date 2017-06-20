package com.mycompany.sort;

public class ArrayStyle {

    public static int[] sort(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];

        }
        for (int i = 0; i < copy.length; i++) {
            int max = copy[i];
            int maxI = i;
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[j] > max) {
                    max = copy[j];
                    maxI = j;
                }
            }
            if (i != maxI) {
                int tmp = copy[i];
                copy[i] = copy[maxI];
                copy[maxI] = tmp;
            }
        }
        return copy;
    }
}
