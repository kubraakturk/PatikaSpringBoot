package com.patika.springboot.bean;

import com.patika.springboot.bean.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod",destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto(){

        return BeanDto
                .builder()
                    .id(0L).beanName("Bean adi").beanData("Bean verisi")
                .build();
    }

}
