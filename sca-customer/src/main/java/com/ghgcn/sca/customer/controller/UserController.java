package com.ghgcn.sca.customer.controller;

import com.ghgcn.sca.dubbo.api.UserService;
import com.ghgcn.sca.entity.User;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GlobalTransactional
    @RequestMapping("/saveUser")
    public boolean saveUser(User user){
        return userService.saveUser(user);
    }
}
