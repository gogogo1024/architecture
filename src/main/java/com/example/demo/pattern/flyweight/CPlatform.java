package com.example.demo.pattern.flyweight;

public class CPlatform implements Platform {
    public CPlatform() {
        System.out.println("CPlatform created");
    }

    /**
     * 执行代码
     *
     * @param code 代码
     */
    @Override
    public void excute(Code code) {
        System.out.println("Compiling and executing C code." + code.getCode());
    }
}
