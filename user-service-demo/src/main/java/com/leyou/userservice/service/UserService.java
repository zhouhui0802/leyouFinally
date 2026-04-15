package com.leyou.userservice.service;

import com.leyou.userservice.pojo.User;

public interface UserService {

    User queryById(Long id);

    User queryByIdSleep(Long id) throws InterruptedException;
}
