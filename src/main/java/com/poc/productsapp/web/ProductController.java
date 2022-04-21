package com.poc.productsapp.web;

import com.poc.productsapp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController{
    @Autowired
    private ProductRepository productRepository;



}
