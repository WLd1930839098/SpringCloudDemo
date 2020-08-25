package com.zr.dao;

import com.zr.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends tk.mybatis.mapper.common.Mapper<User> {
}
