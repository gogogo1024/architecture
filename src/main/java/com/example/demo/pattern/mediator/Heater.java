package com.example.demo.pattern.mediator;

public class Heater implements Colleague{
    private MachineMediator mediator;

    /**
     * @param mediator
     */
    @Override
    public void setMediator(MachineMediator mediator) {
         this.mediator =mediator;
    }

    /**
     * 加热
     * @param temp 温度
     */
    public void on(int temp){
        System.out.println("Heater is on...");
        if(mediator.checkTemperature(temp)){
            System.out.println("Temperature is set to "+temp);
            mediator.off();
        }
    }
    public void off(){
        System.out.println("Heater in off...");
        mediator.wash();
    }
}
