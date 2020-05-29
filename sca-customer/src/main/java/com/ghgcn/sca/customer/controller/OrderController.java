package com.ghgcn.sca.customer.controller;
//
//import com.ghgcn.sca.customer.service.OrderService;
//import com.ghgcn.sca.domain.Order;
//import com.ghgcn.sca.domain.Product;
//import com.ghgcn.sca.dubbo.api.ProductService;
//import org.apache.dubbo.config.annotation.Reference;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class OrderController {
//
//    @Reference
//    private ProductService productService;
//
//    @Autowired
//    private OrderService orderService;
//
//    @RequestMapping("/product/{pid}")
//    public Product findById(@PathVariable("pid") Integer pid){
//        return productService.findByPid(pid);
//    }
//
//    @RequestMapping("/order")
//    public Order createOrder(@RequestParam("pid") Integer pid, @RequestParam("num") Integer num){
//        return orderService.createOrder(pid, num);
//    }
//}
