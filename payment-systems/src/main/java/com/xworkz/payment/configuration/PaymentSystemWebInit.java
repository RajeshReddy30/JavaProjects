package com.xworkz.payment.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PaymentSystemWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer {

@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {

 configurer.enable();
}
@Override
protected Class<?>[] getRootConfigClasses() {
// TODO Auto-generated method stub
return null;
}

@Override
protected Class<?>[] getServletConfigClasses() {
// TODO Auto-generated method stub
return new Class[] {PaymentSystemConfiguration.class};
}

@Override
protected String[] getServletMappings() {
System.out.println("getServlet");
return new String[] {"/"};
}

}
