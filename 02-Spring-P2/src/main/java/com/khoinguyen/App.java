package com.khoinguyen;

import com.khoinguyen.profile.LocalDatasource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);
		LocalDatasource localDatasource = context.getBean(LocalDatasource.class);
		System.out.println(localDatasource);

	}

}
