package com.xiaodao.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class xiaodaoMonitorApp
{
    public static void main(String[] args)
    {
        SpringApplication.run(xiaodaoMonitorApp.class, args);
    }
}