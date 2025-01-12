package com.company;

import java.util.*;

public class CoolNumbers {
    public static List<String> generateCoolNumbers() {
        List<String> coolNumberList = new ArrayList<>();
        List<Character> letters = new ArrayList<>(Arrays.asList('А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'У', 'Х'));
        for (Character letter1 : letters) {
            for (int i = 0; i < 10; i++) {
                for (Character letter2 : letters) {
                    for (Character letter3 : letters) {
                        for (int r = 1; r < 200; r++) {
                            String numberplate = String.format("%c%03d%c%c%02d", letter1, i, letter2, letter3, r);
                            coolNumberList.add(numberplate);
                        }
                    }
                }
            }
        }
        coolNumberList.sort(Comparator.naturalOrder());
        return coolNumberList;
    }

    public static boolean bruteForceSearchInList(List<String> list, String number) {
        long start = System.currentTimeMillis();
        boolean valExist = list.contains(number);
        long stop = System.currentTimeMillis();
        long diff = stop - start;
        System.out.println("Поиск перебором: номер " + (valExist == true ? "найден" : "не найден") + ", поиск занял " + diff + " нс");
        return valExist;
    }

    public static boolean binarySearchInList(List<String> sortedList, String number) {
        long start = System.currentTimeMillis();
        int searсh = Collections.binarySearch(sortedList, number);
        long stop = System.currentTimeMillis();
        boolean valExist = false;
        if (searсh >= 0) {
            System.out.println("Бинарный поиск: номер " + (valExist == true ? "найден" : "не найден") + ", поиск занял " + (stop - start) + " нс");
            valExist = true;
        } return valExist;
    }

    public static boolean searchInHashSet(HashSet<String> hashSet, String number) {
        long start = System.currentTimeMillis();
        boolean valExist = false;
        valExist = hashSet.contains(number);
        long stop = System.currentTimeMillis();
        System.out.println("Поиск в HashSet: номер " + (valExist == true ? "найден" : "не найден") + ", поиск занял " + (stop - start) + " нс");
        return valExist;
    }

    public static boolean searchInTreeSet(TreeSet<String> treeSet, String number) {
        long start = System.currentTimeMillis();
        boolean valExist = treeSet.contains(number);
        long stop = System.currentTimeMillis();
        System.out.println("Поиск в TreeSet: номер " + (valExist == true ? "найден" : "не найден") + ", поиск занял " + (stop - start) + " нс");
        return valExist;
    }
}
