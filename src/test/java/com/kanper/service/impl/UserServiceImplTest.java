package com.kanper.service.impl;

import com.kanper.bean.UserBean;
import com.kanper.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private IUserService userService;

    @Test
    public void findAll() throws Exception {
        List<UserBean> list = userService.findAll();
        for (UserBean userBean : list) {
            System.err.println(userBean);
        }
    }

}