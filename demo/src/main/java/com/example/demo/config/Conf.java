package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.example.demo")
public class Conf extends WebMvcConfigurerAdapter{
	
	@Bean(name="internal")
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver internal = new InternalResourceViewResolver();
		internal.setPrefix("/WEB-INF/jsp/");
		internal.setSuffix(".jsp");
		return internal;
	}
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/styles/**").addResourceLocations("/styles/");
    }
	
	@Bean
	   public MessageSource messageSource() {
	      ResourceBundleMessageSource source = new ResourceBundleMessageSource();
	      source.setBasename("messages");
	      return source;
	   }
 

}
