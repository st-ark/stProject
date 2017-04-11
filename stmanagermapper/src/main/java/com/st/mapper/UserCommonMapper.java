package com.st.mapper;

import com.st.pojo.UserInfo;

/**
 * Created by Administrator on 2017/4/11.
 */
public interface UserCommonMapper {
    UserInfo selectUserInfoAll(String userId);
}
