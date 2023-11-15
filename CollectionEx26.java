package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionEx26 {
    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee(222, "belly"));
        al.add(new Employee(111, "alexa"));
        al.add(new Employee(333, "catty"));

        Collections.sort(al, new EnameComp());

        for (Employee e : al) {
            System.out.println(e.id + " " + e.name);
        }
    }
}
