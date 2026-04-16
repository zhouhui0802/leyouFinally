package com.leyou;

import tk.mybatis.spring.annotation.MapperScan; // 对！
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.leyou.item.mapper")
public class LyItemService
{
    public static void main( String[] args )
    {
        SpringApplication.run(LyItemService.class, args);
        System.out.println( "Hello LyItemService!" );
    }
}
