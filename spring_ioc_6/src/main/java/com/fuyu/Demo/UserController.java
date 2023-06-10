package com.fuyu.Demo;

import com.fuyu.service.UserService;
import com.fuyu.service.impl.UserSeviceImpl;

public class UserController {
    public static void main(String[] args) {
        UserService userService=new UserSeviceImpl();
        userService.save();
    }
}
