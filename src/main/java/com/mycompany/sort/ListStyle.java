package com.mycompany.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListStyle {

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
