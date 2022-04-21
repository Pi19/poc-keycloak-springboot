package com.poc.productsapp;

import com.poc.productsapp.entities.Product;
import com.poc.productsapp.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductsAppApplication.class, args);
    }


}
