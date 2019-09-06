package com.infy.SpringApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Spring {

	public static void main(String[] args) {
		//BeanFactory beanf=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext beanf= new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) beanf.getBean("triangle");
		triangle.draw();
	}

}
