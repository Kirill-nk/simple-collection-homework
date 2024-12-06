package com.company;

import java.util.Scanner;

public class Main {

    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@gmailbox.ru == HeLLO@GMAILbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@gmailbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        System.out.println("Введите одну из команд: ADD, LIST, EXIT");
        Scanner scanner = new Scanner(System.in);
        EmailList emailList = new EmailList();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                emailList.stringSet.forEach(
                   x -> {
                       System.out.println(x);
                   }
                );
            }
            if (input.contains("ADD")) {
                emailList.add(input.substring(4));
            }

            if (input.equals("EXIT"))
                break;
        }
    }

}