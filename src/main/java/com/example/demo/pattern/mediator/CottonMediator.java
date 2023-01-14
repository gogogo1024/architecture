package com.example.demo.pattern.mediator;

public class CottonMediator implements MachineMediator{
    private final Machine machine;
    private final Heater heater;
    private final Motor motor;
    private final Sensor sensor;
    private final SoilRemoval soilRemoval;
    private final Valve valve;

    /**
     * 棉花适配机
     * @param machine 机器
     * @param heater
     * @param motor 马达
     * @param sensor 传感器
     * @param soilRemoval 除灰
     * @param valve 阀门
     */
    public CottonMediator(Machine machine, Heater heater, Motor motor, Sensor sensor, SoilRemoval soilRemoval, Valve valve) {
        this.machine = machine;
        this.heater = heater;
        this.motor = motor;
        this.sensor = sensor;
        this.soilRemoval = soilRemoval;
        this.valve = valve;
        System.out.println(".........................Setting up for COTTON program.........................");
    }

    /**
     * 启动
     */
    @Override
    public void start() {
        machine.start();
    }

    /**
     * 洗涤
     */
    @Override
    public void wash() {
        motor.startMotor();
        System.out.println("Adding detergent"); // 加洗涤剂
        motor.rotateDrum(700);
        System.out.println("Adding softener");// 加柔软剂
        soilRemoval.low();
    }

    /**
     *
     */
    @Override
    public void open() {
        valve.open();
    }

    /**
     *
     */
    @Override
    public void closed() {
        valve.closed();
     }



    /**
     *
     */
    @Override
    public void on() {
        heater.on(40);
    }

    /**
     *
     */
    @Override
    public void off() {
        heater.off();
    }

    /**
     * 检查温度
     * @param temp 温度
     * @return 温度是否达标
     */
    @Override
    public boolean checkTemperature(int temp) {
        return sensor.checkTemperature(temp);
    }
}
