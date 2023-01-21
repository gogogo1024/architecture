package com.example.demo.pattern.state;

public class RoboticOn implements RoboticState {
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    /**
     *
     */
    @Override
    public void walk() {
        System.out.println("Walking ...");
        robot.setState(robot.getRoboticOn());
    }

    /**
     *
     */
    @Override
    public void cook() {
        System.out.println("Cooking ");
        robot.setState(robot.getRoboticCook());
    }

    /**
     *
     */
    @Override
    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
