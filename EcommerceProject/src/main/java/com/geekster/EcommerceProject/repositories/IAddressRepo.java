package com.geekster.EcommerceProject.repositories;

import com.geekster.EcommerceProject.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {

}
