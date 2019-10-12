package com.t87.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan-批量扫描所有的Mapper接口
@MapperScan(value ="com.t87.springboot.mapper")
@SpringBootApplication
public class SpringbootMybatisJspApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisJspApplication.class, args);
    }

}
