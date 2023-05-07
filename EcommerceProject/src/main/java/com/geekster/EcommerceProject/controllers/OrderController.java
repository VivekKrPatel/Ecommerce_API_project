package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Orders;
import com.geekster.EcommerceProject.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/all")
    public String insertOrder(@RequestBody List<Orders> ordersList) {
        return orderService.insertOrders(ordersList);
    }

    @GetMapping(value = "/byId/{id}")
    public Orders getOrderById(@PathVariable Integer id){
        return orderService.getOrderById(id);
    }

}
