
package com.tgc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("启动不使用数据库版本web项目~");
		SpringApplication.run(Application.class, args);
	}

}
