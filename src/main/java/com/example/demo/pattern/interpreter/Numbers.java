package com.example.demo.pattern.interpreter;

public class Numbers implements Expression {
    private final int n;

    public Numbers(int n) {
        this.n = n;
    }

    /**
     * @return
     */
    @Override
    public int interpret() {
        return n;
    }
}


