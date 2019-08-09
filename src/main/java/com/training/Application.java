package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		
		//ApplicationContext or AnnotationConfigApplicationContext or GenericApplicationContext
		GenericApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class); //ACAC is the IOC Container
		
		
		Doctor ram = (Doctor) ctx.getBean("doctor");
		System.out.println(ram);
		System.out.println(ram.hashCode());
		System.out.println(ram.getAddress());
		
		Doctor shyam = (Doctor) ctx.getBean("surgeon");
		System.out.println(shyam);
		System.out.println(shyam.hashCode()); // hashcode => object same/diff
		
		// singleton => instance is created once
		Doctor shyamlal = (Doctor) ctx.getBean("surgeon");
		System.out.println(shyamlal);
		System.out.println(shyamlal.hashCode());
		
		ctx.close(); //else data would leak
	}

}
