package com.t87.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DruidConfig {

    //注册数据源--绑定datasource属性
    @ConfigurationProperties(prefix ="spring.datasource")
    @Bean
    public DataSource druid(){
       return new DruidDataSource();
    }

}
