package com.mycompany.sort;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] arr = {32, 21, 454, 65, 12, 34};
        int[] result = ArrayStyle.sort(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        List<Integer> raw = new ArrayList<>();
        for (Integer item : arr) {
            raw.add(item);
        }
        List<Integer> sorted = ListStyle.sort(raw);
        System.out.println(sorted);
        System.out.println(raw);

    }

}
