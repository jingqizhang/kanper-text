package com.kanper.bean;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Data
@Alias("user")
public class UserBean implements Serializable {
    private int id;
    private String name;
    private String passWord;
}
