package com.atguigu.gulimail.gulimailmembe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 元整调用的实现
 * 1.先要引入feigin插件
 * 2.在开始界面界面引入配置引进的接口扫描的包 其中EnableDiscoveryClient为注册发现发现客户端
 * 然后EnableFeignClients是对远程forgin 的因进入的包的一个扫描
 * 3.在
 */

//开启fegin的远程调用功能
@EnableFeignClients(basePackages = "com.atguigu.gulimail.gulimailmembe.fegin")
//开启注册服务的发现客户端
@EnableDiscoveryClient

@SpringBootApplication
public class GulimailMembeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimailMembeApplication.class, args);
	}

}
