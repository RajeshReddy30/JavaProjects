package com.xworkz.gaming.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class GameSystemConfiguration {

    public GameSystemConfiguration() {
        System.out.println("GameSystemConfiguration initialized");
    }

    @Bean
    public ViewResolver getViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".jsp");
        return resolver;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean getBean() {
    	return new LocalContainerEntityManagerFactoryBean();
    	
    }
}
