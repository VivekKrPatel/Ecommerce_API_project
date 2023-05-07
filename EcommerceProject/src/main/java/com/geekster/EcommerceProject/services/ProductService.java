package com.geekster.EcommerceProject.services;

import com.geekster.EcommerceProject.models.Product;
import com.geekster.EcommerceProject.repositories.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo iProductRepo;

    public String insertProducts(List<Product> productList) {
        List<Product> added = iProductRepo.saveAll(productList);

        if(added != null){
            return "Added products successfully...";
        }
        return "Failed to add products...";
    }

    public List<Product> getAllProducts() {
        return iProductRepo.findAll();
    }

    public List<Product> getProductsBasedOnCategory(String category) {
        return iProductRepo.findByCategory(category);
    }

    public void deleteProductById(Integer id) {
        iProductRepo.deleteById(id);
    }
}
