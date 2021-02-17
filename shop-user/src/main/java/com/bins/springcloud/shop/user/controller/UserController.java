package com.bins.springcloud.shop.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bins.springcloud.shop.user.dto.UserDto;

/**
 * Created by songrongbin on 2017/5/26.
 */
@RestController
public class UserController {

    @RequestMapping("/getPersonInfo")
    public UserDto getPersonInfo(Long userId) {
        UserDto user = new UserDto();
        user.setId(11l);
        user.setUserCode("admin2");
        user.setUserName("admin2");
        return user;
    }

    /*@RequestMapping("/user")
    public String home() {
        return "Hello user";
    }

    @RequestMapping("/user/{id}")
    public UserDto findByUserId(@PathVariable Long id) {
        UserDto user = new UserDto();
        user.setId(11l);
        user.setName("andy");
        return user;
    }

    @RequestMapping("{id}")
    public UserDto findById(@PathVariable Long id) {
        UserDto user = new UserDto();
        user.setId(11l);
        user.setName("andy");
        return user;
    }*/


}