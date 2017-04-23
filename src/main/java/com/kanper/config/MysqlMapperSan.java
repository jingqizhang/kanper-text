package com.kanper.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({ "com.kanper.dao"})
public class MysqlMapperSan {
}
