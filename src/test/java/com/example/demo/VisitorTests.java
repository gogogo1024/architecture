package com.example.demo;


import com.example.demo.pattern.visitor.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VisitorTests {
    @Test
    void visitorTest() {
        System.out.println("Before visitor------ \n");
        HtmlTag parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        HtmlTag p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        parentTag.addChildTag(p1);
        HtmlTag child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        p1.addChildTag(child1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph 2");
        p1.addChildTag(child1);
        parentTag.generateHtml();
        System.out.println("After visitor------ \n");

        Visitor cssClass = new CssClassVisitor();
        Visitor style = new StyleVisitor();
        parentTag = new HtmlParentElement("<html>");
        parentTag.setStartTag("<html>");
        parentTag.setEndTag("</html>");
        parentTag.accept(style);
        parentTag.accept(cssClass);
        p1 = new HtmlParentElement("<body>");
        p1.setStartTag("<body>");
        p1.setEndTag("</body>");
        p1.accept(style);
        p1.accept(cssClass);
        parentTag.addChildTag(p1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Testing html tag library");
        child1.accept(style);
        child1.accept(cssClass);
        p1.addChildTag(child1);
        child1 = new HtmlElement("<P>");
        child1.setStartTag("<P>");
        child1.setEndTag("</P>");
        child1.setTagBody("Paragraph h2");
        child1.accept(style);
        child1.accept(cssClass);
        p1.addChildTag(child1);
        parentTag.generateHtml();
    }
}