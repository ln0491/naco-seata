package com.ghgcn.sca.provider.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class SCAController {




    @GetMapping("/hello")
    public String hello(){
        return "Hello SCA providier";
    }

   /* @RequestMapping("/product/{pid}")
    public Product findById(@PathVariable("pid") Integer pid){
        return productService.findByPid(pid);
    }*/
}
