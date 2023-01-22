package com.example.demo.pattern.mediator;

public class Machine implements Colleague {
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
     * 启动
     */
    public void start() {
        mediator.open();
    }

    /**
     * 清洗
     */
    public void wash() {
        mediator.wash();
    }
}
