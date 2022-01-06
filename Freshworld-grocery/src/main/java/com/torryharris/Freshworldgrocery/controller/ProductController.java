package com.torryharris.Freshworldgrocery.controller;

import com.torryharris.Freshworldgrocery.model.Product;
import com.torryharris.Freshworldgrocery.service.ProductService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// TM Forum Standards

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/productlist")
    public List<Product> productlist() {
        LOG.info("productlist");
        return productService.getAllProducts();
    }

    @GetMapping("/getproductname/{name}")
    public List<Product> getProductByName(@PathVariable(name = "name") String name) {
        LOG.info("getProductByName " + name);
        return productService.getProductByName(name);
    }
    @GetMapping("/getProductpc/{pc}")
    public List<Product> getProductByPc(@PathVariable(name = "pc") int pc) {
        LOG.info("getProductByPc " + pc);
        return productService.getProductByPc(pc);
    }

    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/updateproduct")
    public Product updateEmployee(@RequestBody Product product){
        return productService.updateProduct(product);
    }

    @DeleteMapping("/deleteproduct/{pc}")
    public Product deleteProduct(@PathVariable(name="pc") int pc){
        LOG.info("deleteproduct" + pc);
        return productService.deleteProduct(pc);
    }




}