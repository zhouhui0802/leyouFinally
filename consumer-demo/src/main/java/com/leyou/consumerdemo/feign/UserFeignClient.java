package com.leyou.consumerdemo.feign;


import com.leyou.consumerdemo.feign.impl.UserFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.leyou.consumerdemo.pojo.User;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/15 18:17
 */

@FeignClient(value="user-service", fallback = UserFeignClientFallback.class)   // 声明这是一个Feign客户端，类似@Mapper注解。同时通过value属性指定服务名称
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    User queryUserById(@PathVariable("id") Long id);
}
