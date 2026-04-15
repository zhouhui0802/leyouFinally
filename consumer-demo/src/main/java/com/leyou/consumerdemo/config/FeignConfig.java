package com.leyou.consumerdemo.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import feign.Logger;  // 这个才是对的！
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/15 18:31
 */

@Configuration
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
