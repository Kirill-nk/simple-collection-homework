package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TodoList {
    List<String> list = new ArrayList<>();

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления
        if (index >= 0 && index < list.size()){
            list.add(index, todo);
        } else list.add(todo);
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if ((index >= 0) && (index < list.size())) {
            list.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (index >=0 && index< list.size()) {
            list.remove(index);
        }
    }

    public List<String> getTodos() {
        // TODO: вернуть список дел
        return list;
    }
}