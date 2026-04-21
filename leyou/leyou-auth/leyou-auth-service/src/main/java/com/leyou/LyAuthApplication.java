package com.leyou;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 14:15
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LyAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(LyAuthApplication.class, args);
    }
}
