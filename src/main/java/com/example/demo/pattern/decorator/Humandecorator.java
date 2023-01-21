package com.example.demo.pattern.decorator;

public abstract class Humandecorator implements Human {
    /**
     * @return
     */
    @Override
    public String getDesc() {
        return "I am an human";
    }
}
