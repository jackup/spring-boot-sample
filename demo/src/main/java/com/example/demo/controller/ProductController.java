package com.example.demo.controller;

import com.example.demo.data.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/list")
    public List<Product> list() {
        return (List<Product>) productService.all();
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }
    @DeleteMapping("/id/{id}")
    public Map<String, Boolean> delete(@PathVariable(value = "id")Long productId){

        productService.delete(productId);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    @DeleteMapping("/all")
    public Map<String, Boolean> deleteall() {
        productService.deleteAll();
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
    @DeleteMapping("/name/{name}")
    public Map<String, Boolean> delete(@PathVariable(value = "name")String productName){

        productService.deleteByName(productName);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }

}
