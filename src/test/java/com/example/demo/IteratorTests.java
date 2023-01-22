package com.example.demo;

import com.example.demo.pattern.iterator.ShapeIterator;
import com.example.demo.pattern.iterator.ShapeStorage;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IteratorTests {
    @Test
    void shapeIteratorTest() {
        ShapeStorage shapeStorage = new ShapeStorage();
        shapeStorage.addShape("Polygon");
        shapeStorage.addShape("Circle");
        shapeStorage.addShape("Hexagon");
        shapeStorage.addShape("Rectangle");
        shapeStorage.addShape("Square");
        ShapeIterator iterator = new ShapeIterator(shapeStorage.getShapes());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Apply removing while iterating...");

        iterator = new ShapeIterator(shapeStorage.getShapes());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }

    }
}
