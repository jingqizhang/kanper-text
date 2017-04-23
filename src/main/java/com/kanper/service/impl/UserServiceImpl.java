package com.kanper.service.impl;

import com.kanper.bean.UserBean;
import com.kanper.dao.IUserDao;
import com.kanper.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;


    @Override
    public List<UserBean> findAll() {

            List<UserBean> list = userDao.findAll();

            return list;

    }
}
