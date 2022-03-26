package com.unitbv.beansnaming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.unitbv.beansnaming"})
public class SimpleDependantCfg {

    private final Logger logger = LoggerFactory.getLogger(SimpleDependantCfg.class);

    @Bean(name="simpleBean")
    SimpleBean simpleBean() {
        return new SimpleBeanImpl();
    }

    @Bean(name="dependantBean")
    DependantBean dependantBean() {
        return new DependantBeanImpl(simpleBean());
    }

    @Bean(name="customSimpleBean1")
    SimpleBean customSimpleBean1() {
        return new SimpleBeanImpl();
    }

    @Bean(name="customDependantBean1")
    DependantBean customDepenenantBean1() {
        return dependantBean();
    }

    @Bean(name="customSimpleBean2")
    SimpleBean customSimpleBean2() {
        return new SimpleBeanImpl();
    }

    @Bean(name="customDependantBean2")
    DependantBean customDepenenantBean2() {
        return dependantBean();
    }

}
