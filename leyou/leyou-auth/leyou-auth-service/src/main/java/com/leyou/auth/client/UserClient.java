package com.leyou.auth.client;


import api.UserApi;
import org.springframework.cloud.openfeign.FeignClient;
import api.UserApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.leyou.user.pojo.User;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 14:51
 */
@FeignClient(value = "user-service")
public interface UserClient {

    @GetMapping("/query")
    ResponseEntity<User> queryUser(
            @RequestParam("username") String username,  // 必须自己写！
            @RequestParam("password") String password    // 必须自己写！
    );
}
