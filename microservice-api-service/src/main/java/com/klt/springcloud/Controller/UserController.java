package com.klt.springcloud.Controller;

import com.klt.springcloud.User;
import com.klt.springcloud.service.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserService {
    @Override
    public String addUser(User user) {
        return "api user add";
    }
}
