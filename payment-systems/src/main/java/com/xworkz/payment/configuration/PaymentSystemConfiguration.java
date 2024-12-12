package com.xworkz.payment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class PaymentSystemConfiguration {

	public PaymentSystemConfiguration() {
		System.out.println("PaymentSystemConfiguration");
	}
	
@Bean
	public ViewResolver getview() {
		InternalResourceViewResolver res=new InternalResourceViewResolver();
		res.setSuffix(".jsp");
		return res;
		
	}
@Bean
public LocalContainerEntityManagerFactoryBean getBean() {
	return new LocalContainerEntityManagerFactoryBean();
	
}
}
