package com.unitbv.events.configuration;

import com.unitbv.events.service.CarService;
import com.unitbv.events.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class AppConfig {
    @Bean
    PersonService personService() {
        return new PersonService(null);
    }

    @Bean
    CarService carService() {
        return new CarService();
    }

}
