package com.ghgcn.product.provider.service;

import com.ghgcn.nacos.domain.Product;

public interface IProductService {
    //根据pid查询商品信息
    Product findByPid(Integer pid);

    //扣减库存
    void reduceInventory(Integer pid, Integer number);

    Product saveProduct(Product product);

    void deleteByPid(Integer pid);


     Product updateProduct(Product product) ;
}
