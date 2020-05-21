package com.rana.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.hk2.utilities.binding.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

import com.rana.dao.IStudentDao;
import com.rana.dao.StudentDaoImpl;
import com.rana.service.IStudentService;
import com.rana.service.StudentServiceImpl;
@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig {

			public AppConfig() {
				 System.out.println("AppConfig.AppConfig()");
				 this.packages("com.rana");
				 register(new AbstractBinder() {
					@Override
					protected void configure() {
						System.out.println("AppConfig.AppConfig().new AbstractBinder() {...}.configure()");
						bind(StudentDaoImpl.class).to(IStudentDao.class);
						bind(StudentServiceImpl.class).to(IStudentService.class);
					}
				});
			}
}
