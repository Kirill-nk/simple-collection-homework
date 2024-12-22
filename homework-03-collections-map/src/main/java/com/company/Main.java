package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите номер, имя или команду:");
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        //добавить методы проверки, что имя корректно, проверить, что внутри буквы. А-Яа-я (регулярка(гуглить));
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("add")) {
                return;
            }
            if (input.equals("map")){
                System.out.println(phoneBook);
            }
            if (input.equals("x"))
                break;
        }
    }
}