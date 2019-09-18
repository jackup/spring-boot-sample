package com.example.demo.data.repository;

import com.example.demo.data.entity.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends BaseRepository<Product, Long> {

    void deleteByName(String name);

}
