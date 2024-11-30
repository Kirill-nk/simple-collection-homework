package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: написать консольное приложение для работы со списком дел todoList
        System.out.println("Введите одну из команд: LIST, ADD, EDIT, DELETE");
        Scanner scanner = new Scanner(System.in);
        TodoList todoList =new TodoList();
        while (true){
            String input = scanner.nextLine();
            if (input.equals("LIST")) {
                System.out.println(todoList.getTodos());
            }
        }

    }
}