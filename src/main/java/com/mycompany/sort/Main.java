package com.mycompany.sort;

public class Main {

    public static void main(String[] args) {

        int[] arr = {32, 21, 454, 65, 12};
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i];
            int max_i = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                    max_i = j;
                }
            }
            if (i != max_i) {
                int tmp = arr[i];
                arr[i] = arr[max_i];
                arr[max_i] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
