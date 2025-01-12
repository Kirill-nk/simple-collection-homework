package com.company;

import java.util.stream.Collectors;

public class Main {

    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска вводимого номера в консоль в каждой из структуры данных
     - проанализировать полученные данные
     */

    public static void main(String[] args) {
        System.out.println(CoolNumbers.generateCoolNumbers().stream().skip(90).limit(40).collect(Collectors.toList()));
        System.out.println(CoolNumbers.generateCoolNumbers().size());
        CoolNumbers differ = new CoolNumbers();
    }
}