package com.geekster.EcommerceProject.repositories;

import com.geekster.EcommerceProject.models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}
