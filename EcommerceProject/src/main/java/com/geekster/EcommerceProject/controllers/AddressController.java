package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Address;
import com.geekster.EcommerceProject.models.Orders;
import com.geekster.EcommerceProject.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping(value = "/all")
    public String insertAddress(@RequestBody List<Address> addressList) {
        return addressService.insertAddresses(addressList);
    }

}
