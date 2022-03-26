package com.unitbv.lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.unitbv.lifecycle"})
public class FunBeanCfg {

    @Bean(destroyMethod = "destroyMethod",initMethod = "initMethod")
    FunBean funBean() {
        return new FunBean(new DepBean());
    }
}
