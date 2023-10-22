package com.telran.org.homeworksix;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkSixAppOne {
    public static void main(String[] args) {
//.у вас есть список значений int и вы должны вернуть список, каждое значение которого умножается на 2
        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(5);
        listInt.add(7);
        listInt.add(9);
        listInt.add(1);
        System.out.print(listInt);
        System.out.println();

        for (int i = 0; i < listInt.size(); i++){
            listInt.set(i, listInt.get(i) * 2);
        }
        System.out.print(listInt);
    }
}



