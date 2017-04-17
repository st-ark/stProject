package com.st.service.resource;

import com.st.mapper.PackageInfoMapper;
import com.st.mapper.UserInfoMapper;
import com.st.pojo.PackageInfo;
import com.st.pojo.UserInfo;
import com.st.service.resource.impl.PackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/12.
 */
@Service("pservice")
public class PackageServiceImpl implements PackageService {

    @Autowired
    private PackageInfoMapper packageInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     *根据 id 加载 一套题（ 10 道） 的
     * @param id
     * @return
     */
    @Override
    public Map<String, Object> getPackageByid(String id,String uId) {

        HashMap<String, Object> map = new HashMap<>();

        if (id == null || "".equals("id")) {
            throw new RuntimeException("套题id不能为空");
        }
        if (id != null && !"".equals("id")) {
            //根据用户id查询用户类型
            if (uId == null || "".equals("uId")) {
                throw new RuntimeException("用户id不能为空");
            }
            UserInfo ui = userInfoMapper.checkAuhority(uId);
            if (ui == null || "".equals(ui)) {
                throw new RuntimeException("用户信息为空");
            }
            if (ui != null && !"".equals(ui)) {
                if (ui.getType() == -1) {
                    PackageInfo pi = packageInfoMapper.getPackageByid(id);//若为VIP1加载1-5星级
                    if (pi == null || "".equals(pi)) {
                        throw new RuntimeException("没有套题信息");
                    }
                    map.put("data", pi);
                    return map;
                }
                if (ui.getType() == -2)//若为VIP1加载5-10星
                    {
                    PackageInfo pi1 = packageInfoMapper.getPackageByid1(id);
                    if (pi1 == null || "".equals(pi1)) {
                        throw new RuntimeException("没有套题信息");
                    }
                    map.put("data", pi1);
                    return map;
                }
            }
        }
        return null;
    }
}
