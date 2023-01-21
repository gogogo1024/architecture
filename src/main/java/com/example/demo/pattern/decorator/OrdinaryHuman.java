package com.example.demo.pattern.decorator;

public class OrdinaryHuman implements Human {
    @Override
    public double getHeight() {
        return 1.7;
    }

    @Override
    public String getDesc() {
        return " is a simple ordinary human";
    }
}
