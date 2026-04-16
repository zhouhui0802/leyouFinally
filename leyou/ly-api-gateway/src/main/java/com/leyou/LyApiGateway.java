package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LyApiGateway
{
    public static void main( String[] args )
    {
        SpringApplication.run(LyApiGateway.class, args);
        System.out.println( "Hello LyApiGateway!" );
    }
}
