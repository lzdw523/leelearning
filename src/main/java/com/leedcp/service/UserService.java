package com.leedcp.service;

import com.leedcp.dao.UserMapper;
import com.leedcp.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author liweiwei
 * @Created date 2020/5/16
 * @Desc
 **/
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User getUser(String id){
//        return userMapper.selectByPrimaryKey(id);

        return null;
    }


    public boolean save(User user){
//        return userMapper.insert(user) == 1;

        return true;
    }
}
