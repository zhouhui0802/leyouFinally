package com.leyou.user.service;


import com.leyou.user.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 9:28
 */

public interface UserService {

    public Boolean checkData(String data, Integer type);

    public Boolean sendVerifyCode(String phone);

    public Boolean register(User user, String code);

    public User queryUser(  @RequestParam("username") String username,
                            @RequestParam("password") String password);
}
