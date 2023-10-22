package com.telran.org.homeworksix;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkSixAppThree {
    public static void main(String[] args) {
//у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
        List<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(4);
        listInt.add(7);
        listInt.add(8);
        listInt.add(1);
        listInt.add(2);
        listInt.add(5);
        System.out.print(listInt);
        System.out.println();

        List<Integer> evenList = new ArrayList<>();
        for (Integer num : listInt){
            if (num % 2 !=0){
                evenList.add(num);
            }
        }
        System.out.println(evenList);
    }
}
