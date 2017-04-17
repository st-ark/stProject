package com.st.service.resource.impl;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
public interface PackageService {

    /**
     *
     * @param id
     * @return
     */
    Map<String,Object> getPackageByid(String id,String uId);
}
