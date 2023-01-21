package com.example.demo.pattern.decorator;

public class European extends Humandecorator {
    private final Human human;

    public European(Human human) {
        this.human = human;
    }

    /**
     * @return
     */
    @Override
    public double getHeight() {
        return human.getHeight() + 0.1;
    }

    @Override
    public String getDesc() {
        return human.getDesc() + " is european";
    }

}
