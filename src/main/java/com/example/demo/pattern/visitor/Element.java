package com.example.demo.pattern.visitor;

public interface Element {
    public void accept(Visitor visitor);
}
