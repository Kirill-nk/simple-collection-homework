package com.company;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    List<String> list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления
        if (list.get(index).isEmpty())
        list.add(index, todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (!list.get(index).isEmpty()){
            list.set(index,todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (!list.get(index).isEmpty()){
            list.remove(index);
        }
    }

    public List<String> getTodos() {
        // TODO: вернуть список дел
        return list;
        //Как вернуть лист с индексами, как в задании???
    }
}