package ru.urfu.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    static Task1 task1;

    public static void main(String[] args) {
        byte[] bytes = new byte[0];

        List<User> l1 = new ArrayList<User>();
        List<User> l2 = new ArrayList<User>();
        User user = new User("Коля","mail",bytes);
        l1.add(user);
        l2.add(user);
        System.out.println(Task1.findDuplicates(l1,l2));
    }
}
