package com.comparator;

import java.util.Comparator;

public class EnameComp implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {

        return e1.name.compareTo(e2.name);
    }

}
