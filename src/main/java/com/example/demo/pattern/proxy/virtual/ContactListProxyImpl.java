package com.example.demo.pattern.proxy.virtual;

import java.util.List;

/**
 * 代理实现（其实就一个延迟加载，如果不需要获取职员列表，只是实例化实现类）
 */
public class ContactListProxyImpl implements ContactList {
    private ContactList contactList;


    @Override
    public List<Employee> getEmployeeList() {
        if (contactList == null) {
            System.out.println("Creating contact list and fetching list of employees...");
            contactList = new ContactListImpl();
        }
        return contactList.getEmployeeList();
    }
}
