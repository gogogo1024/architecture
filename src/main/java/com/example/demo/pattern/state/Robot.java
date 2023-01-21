package com.example.demo.pattern.state;

public class Robot implements RoboticState {
    private RoboticState roboticOn;
    private RoboticState roboticCook;
    private RoboticState roboticOff;
    private RoboticState state;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
    }

    public RoboticState getRoboticOn() {
        return roboticOn;
    }

    public void setRoboticOn(RoboticState roboticOn) {
        this.roboticOn = roboticOn;
    }

    public RoboticState getRoboticCook() {
        return roboticCook;
    }

    public void setRoboticCook(RoboticState roboticCook) {
        this.roboticCook = roboticCook;
    }

    public RoboticState getRoboticOff() {
        return roboticOff;
    }

    public void setRoboticOff(RoboticState roboticOff) {
        this.roboticOff = roboticOff;
    }

    public RoboticState getState() {
        return state;
    }

    public void setState(RoboticState state) {
        this.state = state;
    }

    /**
     *
     */
    @Override
    public void walk() {

    }

    /**
     *
     */
    @Override
    public void cook() {

    }

    /**
     *
     */
    @Override
    public void off() {

    }
}
