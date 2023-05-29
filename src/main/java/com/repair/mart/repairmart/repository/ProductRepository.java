package com.repair.mart.repairmart.repository;

import com.repair.mart.repairmart.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {
}
