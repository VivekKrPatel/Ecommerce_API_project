package com.geekster.EcommerceProject.repositories;

import com.geekster.EcommerceProject.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {

//    custom finder
    public List<Product> findByCategory(String category);
}
