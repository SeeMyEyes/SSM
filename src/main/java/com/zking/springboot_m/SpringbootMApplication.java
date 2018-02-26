package com.zking.springboot_m;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zking.springboot_m.dao")
public class SpringbootMApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMApplication.class, args);
	}
}
