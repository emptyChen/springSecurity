package com.example.springsecurityhellowold.dao;

import com.example.springsecurityhellowold.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    SysUser findByUserName(String username);
}
