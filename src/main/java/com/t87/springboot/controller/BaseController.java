package com.t87.springboot.controller;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义的编辑器实现日期格式的转换
 */
@ControllerAdvice
public class BaseController {

    /**
     * 使用@InitBinder解决SpringMVC日期类型无法绑定的问题
     */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        System.out.println("InitBinder==============");
        dataBinder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }
}
