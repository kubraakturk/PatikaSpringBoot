package com.patika.springboot.controller;

import com.patika.springboot.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    //http://localhost:8080//bean/beanDto
    @GetMapping("/bean/beanDto") //url
    @ResponseBody // html olmadan direkt ekranda göster
    public String getBeanDto() {
        return beanConfig.beanDto()+""; //Yanına tırnak işareti ekleyince stringe cast etmiş oluyor.
    }
}
