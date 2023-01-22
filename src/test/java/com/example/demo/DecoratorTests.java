package com.example.demo;

import com.example.demo.pattern.decorator.European;
import com.example.demo.pattern.decorator.Human;
import com.example.demo.pattern.decorator.OrdinaryHuman;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DecoratorTests {
    @Test
    void decoratorTest() {
        Human human = new OrdinaryHuman();
        human = new European(human);
        System.out.println("Desc: " + human.getDesc());
        System.out.println("Height: " + human.getHeight());
    }
}
