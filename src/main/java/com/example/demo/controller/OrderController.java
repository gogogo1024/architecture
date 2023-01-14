package com.example.demo.controller;

import com.example.demo.models.Orders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @RequestMapping("/getOrder")
    public Orders getOrder() {
        Orders order = new Orders();
        order.setId(1);
        order.setTitle("iphone18");
        return order;
    }
}
