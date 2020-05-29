//package com.ghgcn.sca.customer.service.impl;
//
//import com.alibaba.fastjson.JSON;
//import com.ghgcn.sca.customer.dao.OrderDao;
//import com.ghgcn.sca.customer.service.OrderService;
//import com.ghgcn.sca.domain.Order;
//import com.ghgcn.sca.domain.Product;
//import com.ghgcn.sca.dubbo.api.ProductService;
//import io.seata.spring.annotation.GlobalTransactional;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.dubbo.config.annotation.Reference;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class OrderServiceImpl implements OrderService {
//
//    @Reference
//    private ProductService productService;
//    @Autowired
//    private OrderDao orderDao;
//
//    @GlobalTransactional
//    @Override
//    public Order createOrder(Integer pid, Integer num) {
//
//
//        Product product = productService.findByPid(pid);
//        if(product==null){
//            throw new IllegalArgumentException(pid+ " :商品不存在");
//        }
//
//        //下单(创建订单)
//        Order order = new Order();
//        order.setUid(1);
//        order.setUsername("测试用户");
//        order.setPid(pid);
//        order.setPname(product.getPname());
//        order.setPprice(product.getPprice());
//        order.setNumber(num);
//        orderDao.save(order);
//        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
//        //开如扣库存
//        productService.reduceInventory(pid, num);
//
//
//        return order;
//    }
//}
