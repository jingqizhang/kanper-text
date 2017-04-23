package com.kanper.dao;

import com.kanper.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IUserDao {
    List<UserBean> findAll();
}
