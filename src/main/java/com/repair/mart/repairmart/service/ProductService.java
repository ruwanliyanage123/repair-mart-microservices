package com.repair.mart.repairmart.service;

import com.repair.mart.repairmart.dto.ProductRequest;
import com.repair.mart.repairmart.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    public void createProduct(ProductRequest productRequest){
        ProductRequest product = ProductRequest.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

    }
}
