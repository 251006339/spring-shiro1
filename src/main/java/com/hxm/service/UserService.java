package com.hxm.service;

import com.hxm.entity.User;
import com.hxm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author XAIOHU
 * @date 2019/11/3 --18:11
 **/
@Service
public class UserService {

    @Resource
    UserMapper userMapper;

public User selectByName(String name){
     return userMapper.selectByName(name);
}

}
