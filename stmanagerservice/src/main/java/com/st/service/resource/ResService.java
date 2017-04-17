package com.st.service.resource;

import com.st.common.resparam.ResDataList;
import com.st.common.resparam.ResDataParams;
import com.st.common.resparam.ResInfoParams;

import java.util.Map;

/**
 * 资料详细信息
 * Created by Administrator on 2017/4/11.
 */
public interface ResService {
    /**
     * 查找资料
     */
    Map<String,Object> getResList(String resId);
    /**
     * 增加资料
     */
    void addRes(ResInfoParams resInfoParams, ResDataList dataList);

    /**
     * 修改资料
     */
    void updateRes(ResInfoParams resInfoParams,ResDataList dataList);

    /**
     * 删除资料
     */

}
