package com.poc.productsapp.web;

import com.poc.productsapp.entities.Product;
import com.poc.productsapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController{
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/product")
    public List<Product> getAll(){
       return this.productRepository.findAll();
    }

}
