package com.unitbv.multipleConfigs.appConfig;


import com.unitbv.multipleConfigs.BeanA;
import com.unitbv.multipleConfigs.BeanB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.unitbv.multipleConfigs.appConfig")
public class AppConfig {

    @Bean(name = "beanA")
    BeanA beanA() {
        return new BeanA();
    }

    @Bean(name = "beanB")
    BeanB beanB() {
        return new BeanB();
    }

}
