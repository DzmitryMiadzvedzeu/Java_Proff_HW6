package com.telran.org.homeworksix;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWorkSixAppFour {
    public static void main(String[] args) {
//             у вас есть список значений String , и вы должны вернуть список этих значений без каких-либо дубликатов.
        List<String> stringList = new ArrayList<>();
        stringList.add("Bob");
        stringList.add("Barnaul");
        stringList.add("Boba");
        stringList.add("Brabus");
        stringList.add("Bomba");
        stringList.add("Bomba");
        stringList.add("Bob");
        stringList.add("Brabus");
        stringList.add("Boba");
        stringList.add("Barnaul");

        System.out.print(stringList);
        System.out.println();

        List<String> sorting = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(sorting);
    }
}

//поковырявшись в Stream, который вы показали на лекции, я нашёл функцию для удаления дубликатов, но, наверное, это
// читерство...
