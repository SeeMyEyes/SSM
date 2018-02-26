package com.zking.springboot_m.controller;

import com.zking.springboot_m.dao.UserDao;
import com.zking.springboot_m.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonConeroller {
    @Autowired
    UserDao userDao;
    @RequestMapping("add")
    public String add(UserEntity entity){
        userDao.userAdd(entity);
        return "add success";
    }
}
