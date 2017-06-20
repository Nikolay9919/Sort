package com.mycompany.sort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {32, 21, 454, 65, 12};
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int maxI = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxI = j;
                }
            }
            if (i != maxI) {
                int tmp = arr[i];
                arr[i] = arr[maxI];
                arr[maxI] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
