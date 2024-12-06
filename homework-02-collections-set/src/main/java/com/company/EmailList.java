package com.company;

import java.util.*;

public class EmailList {

    Set<String> stringSet = new TreeSet<>();
    List<String> duplicates = new ArrayList<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // TODO принять решение добавлять аргумент email или нет должен этот метод
        if (email.contains("@") && email.contains("."))
            stringSet.add(email.toLowerCase());
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return stringSet.stream().toList();
    }
}