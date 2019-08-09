package com.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
	
	// register bean here in the configuration
	@Bean
//	@Lazy
	public Doctor doctor() {
		Doctor ramesh = new Doctor();
		ramesh.setDoctorId(1020);
		ramesh.setDoctorName("Ramesh"); // primitive injection
		ramesh.setAddress(address());  //setter injection
		ramesh.setPhoneNumber(98989898);
		
		return ramesh;
	}

	@Bean
	public Doctor surgeon() {
		Doctor suresh = new Doctor();
		suresh.setDoctorId(1030);
		suresh.setDoctorName("Suresh");
		suresh.setPhoneNumber(97979797);
		
		return suresh;
	}
	
	@Bean
	public Address address() {
		return new Address("Gandhi street","Chennai",600001);
	}

}
