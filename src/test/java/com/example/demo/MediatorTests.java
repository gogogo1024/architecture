package com.example.demo;

import com.example.demo.pattern.mediator.*;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MediatorTests {
    @Test
    void mediatorTest() {
        MachineMediator mediator = null;

        Button button = new Button();

        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Motor motor = new Motor();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();


        mediator = new CottonMediator(machine, heater, motor, sensor, soilRemoval,valve);

        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);

        button.press();
    }
}
