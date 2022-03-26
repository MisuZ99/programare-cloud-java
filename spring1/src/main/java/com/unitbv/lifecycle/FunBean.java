package com.unitbv.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class FunBean implements InitializingBean, DisposableBean {
    private Logger logger = LoggerFactory.getLogger(FunBean.class);

    private DepBean depBean;

    FunBean(DepBean depBean) {
        this.depBean=depBean;
    }

    public void initMethod(){
        logger.debug("Bean initMethod called!");
    }

    public void destroyMethod(){
        logger.debug("Bean destroyMethod called!");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        logger.debug("Bean initialized!");
    }

    @Override
    public void destroy() throws Exception {
        logger.debug("Bean destroyed!");
    }
}
