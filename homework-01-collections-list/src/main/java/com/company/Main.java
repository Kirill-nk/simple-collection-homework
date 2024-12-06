package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList

        System.out.println("Введите одну из команд: LIST, ADD, EDIT, DELETE");
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
//                System.out.println(String.join("-", todoList.getTodos()));
                for (int i = 0; i < todoList.list.size(); i++) {
                    System.out.println(i + " - " + todoList.list.get(i));
                }
                //String join/
            }
            if (input.contains("ADD")) {
                todoList.add(input.substring(4));
            }
            if (input.contains("DELETE")) {
                todoList.delete(Integer.parseInt(input.substring(7)));
            }
            if (input.contains("EDIT")) {
                todoList.edit(Integer.parseInt(input.substring(5,6)), input.substring(7));
            }
            if (input.equals("EXIT"))
                break;
        }
    }
}