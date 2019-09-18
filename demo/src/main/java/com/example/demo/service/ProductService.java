package com.example.demo.service;

import com.example.demo.data.entity.Product;
import com.example.demo.data.repository.BaseRepository;
import com.example.demo.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProductService extends BaseService<Product, Long>  {

    @Autowired
    public ProductRepository repository;

    @Override
    public BaseRepository<Product, Long> getRepository() {
        return repository;
    }

    @Transactional
    public String deleteByName(String name) {
        repository.deleteByName(name);
        return "0";
    }

}
