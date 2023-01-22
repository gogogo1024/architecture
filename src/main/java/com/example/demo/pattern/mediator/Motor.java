package com.example.demo.pattern.mediator;

public class Motor {

    /**
     * 开启马达
     */
    public void startMotor() {
        System.out.println("Start motor...");
    }

    /**
     * 设置转速
     *
     * @param rpm 转速
     */
    public void rotateDrum(int rpm) {
        System.out.println("Rotating drum at " + rpm + " rpm.");
    }
}
