package com.klt.springcloud.Controller;

import com.klt.springcloud.User;
import com.klt.springcloud.service.ConsumeUserService;
import com.klt.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController{
    @Autowired
    ConsumeUserService consumeUserService;
    @RequestMapping("apiAdd")
    public String addUser() {
        User user = new User();
        user.setId(2);
        user.setName("my");
        return consumeUserService.addUser(user);
    }
}
