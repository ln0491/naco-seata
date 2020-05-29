package com.ghgcn.sca.provider.dubbo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ghgcn.sca.dubbo.api.UserService;
import com.ghgcn.sca.entity.User;
import com.ghgcn.sca.provider.mapper.UserMapper;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class UserServiceImpl  extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);

        return userList;
    }

    @Override
    public Boolean saveUser(User user) {

         save(user);
//        int i =1/0;
        return true;
    }
}
