package com.example.demo.pattern.mediator;

/**
 * 按钮
 */
public class Button implements Colleague {
    private MachineMediator mediator;

    /**
     * 设置适配器
     *
     * @param mediator
     */
    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 按下
     */
    public void press() {
        mediator.start();
    }
}
