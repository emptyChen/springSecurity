package com.example.springsecurityhellowold.dao;

import com.example.springsecurityhellowold.entity.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PermissionMapper {

    List<Permission> findAll();

    List<Permission> findByAdminUserId(int userId);
}
