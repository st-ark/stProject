package com.st.service.question;

import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */

public interface QuestionSolveConService {

    /**
     *
     * @param id
     * @return
     * 根据 id 查询 一个 解题思路 的全
     */
   Map<String,Object> getSolveByid(String id);


}
