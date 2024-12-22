package com.company;

import javax.sql.rowset.JdbcRowSet;
import java.util.*;

public class PhoneBook {

    Map<String, Set<String>> phoneBook = new HashMap<>();

    //можно добавить метод, можно не добавлять.
    // Выбрать правильную коллекцию.

    //Сделать новый метод, который проверит на регулярку
    //name.matches("^[а-яА-ЯёЁ]+$")
    public void testRegular(String name) {
        System.out.println(name.matches("^[а-яА-ЯёЁ]+$"));
    }

    public void addContact(String name, String phone) {

        // TODO проверь корректность формата имени и телефона
        // TODO (рекомендуется написать отдельные методы для проверки является строка именем/телефоном)
        // TODO если такой номер уже есть в списке, то перезаписать имя абонента
        for (Map.Entry<String, Set<String>> entry : new HashSet<>(phoneBook.entrySet())) {
            Set<String> value = entry.getValue();
            value.remove(phone);
            if (value.isEmpty()) {
                phoneBook.remove(entry.getKey());
            }
        }
        if (!phoneBook.containsKey(name)) {
            Set<String> set = new HashSet<>();
            set.add(phone);
            phoneBook.put(name, set);
        } else {
            phoneBook.get(name).add(phone);
        }
    }

    public Set<String> getContactByName(String name) {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контакт не найден - вернуть пустой TreeSet
        if (!phoneBook.containsKey(name)) {
            return new TreeSet<>();
        }
        Set<String> strings = phoneBook.get(name);
        String join = String.join(", ", strings);
        return Set.of(name + " - " + join);
    }

    public String getContactByPhone(String phone) {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контакт не найдены - вернуть пустую строку
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phone)) {
                return entry.getKey() + " - " + String.join(", ", entry.getValue());
            }
        }
        return "";
    }

    public Set<String> getAllContacts() {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контактов нет в телефонной книге - вернуть пустой TreeSet
        if (phoneBook.isEmpty()) {
            return new TreeSet<>();
        }
        Set<String> set = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            set.add(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
        return set;
    }
}
