package com.torryharris.Freshworldgrocery.service;

import com.torryharris.Freshworldgrocery.model.Product;
import com.torryharris.Freshworldgrocery.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    public List<Product> getAllProducts() {
        LOG.info("getAllProducts");

        return productRepository.findAll();

    }
    public List<Product> getProductByName(String name) {
        LOG.info("getProductByName");
        return productRepository.findByName(name);
    }
    public List<Product> getProductByPc(int pc) {
        LOG.info("getProductByPc");
        return productRepository.findByPc(pc);
    }
    public Product addProduct(Product product){
        return productRepository.save(product);
    }

    public Product updateProduct(Product product){
        return productRepository.save(product);
    }

    public Product deleteProduct(int pc){
        productRepository.deleteById(pc);
        LOG.info("deleteproduct" + pc);
        return null;
    }


}