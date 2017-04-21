package com.st.mapper;

import com.st.pojo.UserInfo;
import com.st.pojo.UserInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {


    /**
     * 根据用户id判断用户类型
     * @param uId
     * @return
     */
    UserInfo checkAuhority(String uId);
}