package com.ghgcn.product.provider.dao;

import com.ghgcn.nacos.domain.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product, Integer> {
}
