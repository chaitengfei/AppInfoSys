package com.ctf.service.developer;

import com.ctf.entity.Dev_User;import org.apache.ibatis.annotations.Param;

public interface DevUserService {
    /**
     * 登录验证
     * @param devCode
     * @param password
     * @return
     */
    public Dev_User login(@Param("devCode")String devCode, @Param("password")String password);
}
