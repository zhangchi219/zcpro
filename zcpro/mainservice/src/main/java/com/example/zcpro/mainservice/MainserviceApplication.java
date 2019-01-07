package com.example.zcpro.mainservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.example.mainservice.dao")
@EnableTransactionManagement
public class MainserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainserviceApplication.class, args);
	}

}

