package com.mycompany.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] arr = {32, 21, 454, 65, 12, 34};
        int[] result = sort(arr);

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
        List<Integer> sorted = sort(raw);
        System.out.println(sorted);
        System.out.println(raw);

    }

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

    public static List<Integer> sort(List<Integer> raw) {
        List<Integer> list = new ArrayList<>();
        for (Integer item : raw) {
            list.add(item);
        }
        Collections.sort(list);
        Collections.reverse(list);
        return list;
    }

}
