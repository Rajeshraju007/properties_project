package com.torryharris.Freshworldgrocery.repository;

import java.util.List;

import com.torryharris.Freshworldgrocery.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;





@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {


    public abstract List<Product> findByName(String name);
    public abstract List<Product> findByPc(int pc);
}