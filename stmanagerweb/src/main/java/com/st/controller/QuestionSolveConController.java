package com.st.controller;

import com.alibaba.fastjson.JSON;
import com.st.common.params.QuestionSolve;
import com.st.common.params.QuestionSolveCon;
import com.st.common.pojo.StResult;
import com.st.service.question.QuestionSolveConService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/11.
 */
@Controller
@RequestMapping("/qsc")
public class QuestionSolveConController {

    private static Logger logger = Logger.getLogger(QuestionSolveCon.class);

    @Autowired
    private QuestionSolveConService questionSolveConService;

    /**
     *
     * @param id
     * @return
     * 根据 id 查询 一个 解题思路 的所有信息
     */

    @ResponseBody
    @RequestMapping(value = "/getSolveByid/{id}",method = RequestMethod.GET)
    public Map<String,Object> getSolveByid (@PathVariable String id)
    {
        HashMap<String,Object> map=new HashMap<>();
        if(id==null || "".equals("id"))
        {
            StResult result =new StResult("请求失败");
            map.put("status",result);
            return map;
        }
        else{
            Map<String,Object> data=questionSolveConService.getSolveByid(id);
            map.put("data",data);
            map.put("status","请求成功");
            return map;
        }
    }

    /**
     * 添加解题思路
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addSolve",method = RequestMethod.POST)
    public StResult addSolve(String solve,String solveCon)
    {
        logger.info(solve);
        if(solve==null || "".equals(solve))
        {
           return StResult.ok("输入参数有误");
        }
        if(solve !=null && !"".equals(solve))
        {
            QuestionSolve qs= JSON.parseObject(solve, QuestionSolve.class);
            List<QuestionSolveCon> list= JSON.parseArray(solveCon, QuestionSolveCon.class);
            int count=questionSolveConService.addQuestionSolve(qs,list);
            if(count>0)
            {
               return  StResult.ok("添加成功");
            }
        }

        return StResult.ok("添加失败");

    }

    /**
     * 修改思路
     * @param solve
     * @return
     */
    @ResponseBody
    @RequestMapping(value="updateSolve",method = RequestMethod.POST)
    public StResult updateSolve(String solve,String solveCon)
    {
        if(solve==null || "".equals(solve))
        {
            StResult.ok("输入参数有误");
        }
        else{
            QuestionSolve qs=JSON.parseObject(solve,QuestionSolve.class);
             List<QuestionSolveCon>list=JSON.parseArray(solveCon,QuestionSolveCon.class);
             int count= questionSolveConService.updateQuestionSolve(qs,list);
            if(count>0)
            {
                return StResult.ok("修改成功");
            }
        }
        return null;
    }

    /**
     * 删除解题思路
     * @param solveId upId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/delSolve" ,method = RequestMethod.GET)
    public StResult delSolver(String solveId,String upId)
    {
        if(solveId==null || "".equals("solveId"))
        {
            StResult.ok("solveId能不能为空");
        }
        else{
           int count= questionSolveConService.delQuestionSolve(solveId,upId);
           if(count>0)
           {
               return StResult.ok("删除成功");
           }

        }
        return null;
    }

}
