package com.example.demo.pattern.flyweight;

public class JavaPlatform implements Platform {
    public JavaPlatform() {
        System.out.println("JavaPlatform created");
    }

    /**
     * 执行代码
     *
     * @param code 代码
     */
    @Override
    public void excute(Code code) {
        System.out.println("Compiling and executing Java code." + code.getCode());
    }
}