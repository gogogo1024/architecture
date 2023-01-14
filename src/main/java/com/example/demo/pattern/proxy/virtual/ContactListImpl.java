package com.example.demo.pattern.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

public class ContactListImpl implements ContactList {
    private static List<Employee> getEmpList() {
        List<Employee> empList = new ArrayList<Employee>(1);
        empList.add(new Employee("xiaomi"));
        return empList;
    }

    /**
     * @return
     */
    @Override
    public List<Employee> getEmployeeList() {
        return getEmpList();
    }
}
