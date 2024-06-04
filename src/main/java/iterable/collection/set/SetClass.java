package main.java.iterable.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetClass {
    public static void main(String[] args) {
        String[] str = {"a", "b", "c", "d", "e", "f"};
        Set<String> set = new HashSet<>();
        Collections.addAll(set, str);
        System.out.println(set);
        if (!set.isEmpty()) {
            set.clear();
        }
        System.out.println(set);
    }
}
