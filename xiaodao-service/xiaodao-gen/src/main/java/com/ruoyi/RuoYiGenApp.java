package com.xiaodao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.xiaodao.system.annotation.EnableRyFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.xiaodao.*.mapper")
@EnableRyFeignClients
public class xiaodaoGenApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(xiaodaoGenApp.class, args);
    }
}
