package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.models.Orders;
import com.geekster.EcommerceProject.repositories.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    IOrderRepo iOrderRepo;

    public String insertOrders(List<Orders> ordersList) {

        List<Orders> added = iOrderRepo.saveAll(ordersList);

        if(added != null){
            return "Added orders successfully...";
        }
        return "Failed to add orders...";
    }

    public Orders getOrderById(Integer id) {
        Optional<Orders> orderObj = iOrderRepo.findById(id);
        return orderObj.get();
    }
}
