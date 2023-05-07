package com.geekster.EcommerceProject.controllers;

import com.geekster.EcommerceProject.models.Product;
import com.geekster.EcommerceProject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(value = "/all")
    public String addProducts(@RequestBody List<Product> productList) {
        return productService.insertProducts(productList);
    }

    @GetMapping(value = "/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(value = "/category")
    public List<Product> getProductsBasedOnCategory(@RequestParam String category) {
        return productService.getProductsBasedOnCategory(category);
    }

    @DeleteMapping(value = "/byId/{id}")
    public void deleteProductById(@PathVariable Integer id) {
        productService.deleteProductById(id);
    }

}
