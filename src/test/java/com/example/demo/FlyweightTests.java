package com.example.demo;

import com.example.demo.pattern.flyweight.Code;
import com.example.demo.pattern.flyweight.Platform;
import com.example.demo.pattern.flyweight.PlatformFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FlyweightTests {
    @Test
    void plateformTest() {
        System.out.println("\n");
        Code cCode = new Code();
        cCode.setCode("C code");
        Platform platform = PlatformFactory.getPlatformInstance("C");
        platform.excute(cCode);
        cCode.setCode("C code #includ");
        platform.excute(cCode);
        System.out.println("C code excute completed");
        System.out.println("\n");

        Code javaCode = new Code();
        javaCode.setCode("Java code");
        platform = PlatformFactory.getPlatformInstance("Java");
        platform.excute(javaCode);
        javaCode.setCode("Java code import");
        platform.excute(javaCode);
        PlatformFactory.getPlatformInstance("Java");
        platform.excute(javaCode);
        System.out.println("Java code excute completed");
        System.out.println("\n");

    }
}
