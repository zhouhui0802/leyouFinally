package com.leyou.consumerdemo.controller;

import com.leyou.consumerdemo.pojo.User;
import com.leyou.consumerdemo.service.UserService;
import com.leyou.consumerdemo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: TianCi.Xiong
 * @Description:
 * @Date: Created in 2019-10-31 8:43
 */
@RestController
@RequestMapping("consume")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping
    public List<User> consume(@RequestParam("ids") List<Long> ids){
        return this.userService.querUserByIds(ids);
    }

    @GetMapping("/eureka")
    public List<User> consumeEureka(@RequestParam("ids") List<Long> ids){
        return this.userService.queryUserByIds(ids);
    }

    @GetMapping("/eurekaLoadbalance")
    public List<User> consumeEurekaLoadbalance(@RequestParam("ids") List<Long> ids){
        return this.userService.queryUserByIdsLoadbalance(ids);
    }

    @GetMapping("/eurekaLoadbalanceHystrix")
    public List<User> consumeEurekaLoadbalanceHystrix(@RequestParam("ids") List<Long> ids) throws Exception{
        return this.userService.queryUserByIdsHystrix(ids);
    }

    @GetMapping("/eurekaLoadbalanceHystrixFeign")
    public List<User> consumeEurekaLoadbalanceHystrixFeign(@RequestParam("ids") List<Long> ids) throws Exception{
        return this.userService.queryUserByIdsByFeign(ids);
    }
}
