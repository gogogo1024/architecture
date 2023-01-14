package com.example.demo.controller;

import com.example.demo.models.Orders;
import com.example.demo.repository.OrdersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/hello")
@RestController
public class HelloController {
    @Autowired
    private OrdersRespository ordersRespository;

    @RequestMapping("/getAll")
    public List<Orders> getAll() {
        List<Orders> listOrders = (List<Orders>) ordersRespository.getAll();
        return listOrders;
    }
}
