package com.atguigu.gulimail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * nacos 可以做配置中心，也可以做注册中心

 开启注册服务的发现客户端 ，也就是 注册中心，有注册中心可以使得各个服务之间相互调用
 注册中心相当于一个集中的分配中心，通过他可以连接各个微服务


 配置中心是对配置内容的修改，可以再不编码实现数据的修改
 配置中心是对自己配置信息的一个修改
 *
 */

//注册中心

@EnableDiscoveryClient
@SpringBootApplication
public class GulimailCouponApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimailCouponApplication.class, args);
	}

}
