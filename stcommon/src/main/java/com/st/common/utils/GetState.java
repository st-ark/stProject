package com.st.common.utils;

/**
 * Created by Administrator on 2017/4/11.
 */
public class GetState {
    private int state;

    public  static String  getState(int state){
        if (state==0){
            return "待审核";
        }else if(state==-1){
            return "未通过";
        }else if (state==-2){
            return "待删除";
        }else{
            return "发布";
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
