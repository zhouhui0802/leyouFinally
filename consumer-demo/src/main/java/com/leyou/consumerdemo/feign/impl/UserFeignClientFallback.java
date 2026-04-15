package com.leyou.consumerdemo.feign.impl;


import com.leyou.consumerdemo.feign.UserFeignClient;
import com.leyou.consumerdemo.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/15 18:25
 */
@Component
public class UserFeignClientFallback implements UserFeignClient {

    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setId(id);
        user.setName("用户查询出现异常！");
        return user;
    }
}
