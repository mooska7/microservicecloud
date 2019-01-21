package com.klt.springcloud.service;

import com.klt.springcloud.User;
//import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("userService")
public interface UserService {
//    @RequestMapping("addUser")
    public String addUser(User user);
}
