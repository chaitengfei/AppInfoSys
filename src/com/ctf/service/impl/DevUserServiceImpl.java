package com.ctf.service.impl;

import com.ctf.dao.devuser.DevUserMapper;
import com.ctf.entity.Dev_User;
import com.ctf.service.developer.DevUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Spring动态注入
 */
@Service
public class DevUserServiceImpl implements DevUserService {

    @Resource
    private DevUserMapper mapper;//Spring动态注入mapper


    @Override
    public Dev_User login(String devCode, String password) {
        Dev_User user = null;
        user = mapper.findBydevCode(devCode);
        if(null != user){
            if(!user.getDevPassword().equals(password)){
                user = null;
            }
        }
        return user;
    }
}
