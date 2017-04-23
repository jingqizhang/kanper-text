package com.kanper.service;

import com.kanper.bean.UserBean;

import java.util.List;

/**
 * 张静
 */
public interface IUserService {
    /**
     *
     * @return
     */
    List<UserBean> findAll();
}
