package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.models.Address;
import com.geekster.EcommerceProject.models.Orders;
import com.geekster.EcommerceProject.repositories.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    IAddressRepo iAddressRepo;

    public String insertAddresses(List<Address> addressList) {
        List<Address> added = iAddressRepo.saveAll(addressList);
        if(added != null){
            return "Added addresses successfully...";
        }
        return "Failed to add addresses...";
    }
}
