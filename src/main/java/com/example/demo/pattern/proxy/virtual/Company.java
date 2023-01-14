package com.example.demo.pattern.proxy.virtual;

public class Company {
    private String companyName;
    private ContactList contactList;

    public Company(String companyName, ContactList contactList) {
        this.companyName = companyName;
        this.contactList = contactList;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ContactList getContactList() {
        return contactList;
    }
}
