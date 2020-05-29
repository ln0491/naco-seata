package com.ghgcn.sca.dubbo.api;

import com.ghgcn.sca.entity.User;

import java.util.List;

public interface UserService {

    public List<User> testSelect();

    public Boolean saveUser(User user);
}
