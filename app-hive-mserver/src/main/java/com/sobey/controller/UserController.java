package com.sobey.controller;

import com.sobey.entity.User;
import com.sobey.service.IUserService;
import com.sobey.utils.ReadisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {



    @Autowired
    private IUserService userService;

    @PostMapping("/rest/user/add/update")
    public Object userAddAndUpdate(
            @RequestBody User user
            ){
        return userService.userAddAndUpdate(user);
    }
    @PostMapping("/rest/user/select")
    public Object userSelect(
            @RequestBody User user
    ){
        return userService.userSelect(user);
    }
}
