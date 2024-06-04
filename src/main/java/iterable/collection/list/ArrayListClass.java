package main.java.iterable.collection.list;

import main.java.inherit.Person;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<Person> arrayList = new ArrayList<>();
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Smith");
        Person person1 = new Person();
        person1.setFirstName("Ali");
        person1.setLastName("Khosravani");
        System.out.println(person);
        arrayList.add(person);
        arrayList.add(person1);
        System.out.println(arrayList);
    }
}
