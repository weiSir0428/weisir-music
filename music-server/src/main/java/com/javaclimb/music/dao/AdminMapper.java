package com.javaclimb.music.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 管理员
 */
@Repository
public interface AdminMapper {

    /**
     * 验证密码是否正确
     * @param username
     * @param password
     * @return
     */
    public int verifyPassword(@Param("username")String username, @Param("password")String password);
}
