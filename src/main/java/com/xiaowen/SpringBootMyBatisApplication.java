package com.xiaowen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaowen.mapper")
public class SpringBootMyBatisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMyBatisApplication.class, args);
	}

}
