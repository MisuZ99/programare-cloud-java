package com.unitbv.dependsOn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    BeanA beanA() {
        return new BeanA();
    }

    @Bean
    BeanB beanB() {
        return new BeanB();
    }

    @Bean
    BeanC beanC() {
        return new BeanC();
    }
}
