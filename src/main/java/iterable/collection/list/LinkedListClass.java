package main.java.iterable.collection.list;

import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        try {
            list.add("a");
            list.addFirst("b");
            list.addFirst("c");
            list.addFirst("d");
            list.addFirst("e");
            list.addFirst("f");
            list.addFirst("g");
            list.addFirst("h");
            list.addFirst("i");
            list.addFirst("j");
            list.add(1, "k");

            System.out.println(list);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
