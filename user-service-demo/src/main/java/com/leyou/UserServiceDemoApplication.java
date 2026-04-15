package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启EurekaClient功能
public class UserServiceDemoApplication
{
    public static void main( String[] args )
    {

        SpringApplication.run(UserServiceDemoApplication.class, args);
        System.out.println( "Hello UserServiceDemoApplication!" );
    }
}
