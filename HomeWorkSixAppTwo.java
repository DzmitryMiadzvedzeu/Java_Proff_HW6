package com.telran.org.homeworksix;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkSixAppTwo {
    public static void main(String[] args) {
//у вас есть список значений String , и вы должны вернуть список длины каждого из этих значений String .
        List<String> stringList = new ArrayList<>();
        stringList.add("Bob");
        stringList.add("Boba");
        stringList.add("Bomba");
        stringList.add("Brabus");
        stringList.add("Barnaul");

        System.out.println(stringList);

        List<Integer> lengths = getLengths(stringList);
        System.out.println(lengths);
    }

    private static List<Integer> getLengths(List<String> strings) {
        List<Integer> lengths = new ArrayList<>();
        for (String value : strings) {
            lengths.add(value.length());
        }
        return lengths;
    }

}
