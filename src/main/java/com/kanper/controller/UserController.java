package com.kanper.controller;

import com.kanper.bean.UserBean;
import com.kanper.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/findAll")
    public List<UserBean> findAll() {
        return userService.findAll();
    }
}
