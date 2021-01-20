package com.leedcp.dao;

import com.leedcp.model.LoginInfo;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(LoginInfo record);

    int insertSelective(LoginInfo record);

    LoginInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);
}