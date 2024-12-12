package com.xworkz.meta.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class MetaAppConfiguration {

	public MetaAppConfiguration() {
		System.out.println("MetaAppConfiguration");
	}

}
