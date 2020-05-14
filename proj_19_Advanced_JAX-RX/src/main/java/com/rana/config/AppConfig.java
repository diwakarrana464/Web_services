package com.rana.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.rana.filters.MyRequestFilter;
import com.rana.filters.MyResponseFilter;

@ApplicationPath("/rest")    // url pattern
public class AppConfig extends ResourceConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig():: constructor of config class");
		this.packages("com.rana");
		
		// activate filters ....
		this.register(MyRequestFilter.class);
		this.register(MyResponseFilter.class);
	}
}
