package com.qly.cocoa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(
		exclude= {DataSourceAutoConfiguration.class})
public class App {

	public static void main(String[] args) {
		System.out.println("Cocoa开始启动Spring boot");
		SpringApplication.run(App.class, args);
		System.out.println("Cocoa启动完毕");

		System.out.println("修改测试");
	}
}
