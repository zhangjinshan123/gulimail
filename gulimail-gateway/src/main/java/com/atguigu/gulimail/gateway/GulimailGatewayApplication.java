package com.atguigu.gulimail.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//网关中心配置


//开启注册服务发现
@EnableDiscoveryClient
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GulimailGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimailGatewayApplication.class, args);
	}

}
