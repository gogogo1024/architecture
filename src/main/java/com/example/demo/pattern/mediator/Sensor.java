package com.example.demo.pattern.mediator;

/**
 * 传感器
 */
public class Sensor {

    /**
     * 温度检查
     *
     * @param temp 温度
     * @return 温度是否达标
     */
    public boolean checkTemperature(int temp) {
        System.out.println("Temperature reached " + temp + " *C");
        return true;
    }

}