package com.example.demo.pattern.mediator;

public class Valve implements Colleague{
    private MachineMediator mediator;
    /**
     * 设置适配器
     * @param mediator
     */
    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;

    }

    /**
     * 打开阀门
     */
    public void open(){
        System.out.println("Valve is opened...");
        System.out.println("Filling water...");
        mediator.closed();
    }

    /**
     * 关闭阀门
     */
    public void  closed(){
        System.out.println("Valve is closed...");
        mediator.on();
    }


}
