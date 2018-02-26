package com.zking.springboot_m.dao;

import com.zking.springboot_m.entity.UserEntity;
import org.mybatis.spring.annotation.MapperScan;

public interface UserDao {

    public void userDel(int id);
    public UserEntity selectOne(int uid);
    public void userAdd(UserEntity userEntity);

}
