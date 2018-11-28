package com.ctf.dao.devuser;
import java.util.List;

import com.ctf.entity.Dev_User;
import org.apache.ibatis.annotations.Param;

/**
 * DevUserMapper接口
 */
public interface DevUserMapper {
    int insert(Dev_User devUser);
    /**
     * 根据devCode获取用户记录
     * @param devCode
     * @return
     */
   Dev_User findBydevCode(@Param("devCode")String devCode);

}
