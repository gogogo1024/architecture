package com.example.demo.pattern.visitor;


public interface Visitor {
    public void visit(HtmlElement element);

    public void visit(HtmlParentElement element);
}
