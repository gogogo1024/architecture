package com.example.demo;

import com.example.demo.pattern.proxy.virtual.Company;
import com.example.demo.pattern.proxy.virtual.ContactList;
import com.example.demo.pattern.proxy.virtual.ContactListProxyImpl;
import com.example.demo.pattern.proxy.virtual.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ProxyTests {
    @Test()
    void virtualTest() {
        ContactList contactList = new ContactListProxyImpl();
        Company company = new Company("ABC Company", contactList);
        System.out.println("Company Name: " + company.getCompanyName());
        System.out.println("Requesting for contact list");
        contactList = company.getContactList();
        List<Employee> empList = contactList.getEmployeeList();
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
