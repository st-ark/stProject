package com.st.common.params;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/13.
 */
public class ParseUrl {
    /**
     * 将url参数转换成map
     * @param param aa=11;bb=22;cc=33
     * @return
     */
    public static Map<String, Object> getUrlParams(String param) {
        Map<String, Object> map = new HashMap<String, Object>(0);
        if (StringUtils.isBlank(param)) {
            return map;
        }
        String[] params = param.split(";");
        for (int i = 0; i < params.length; i++) {
            String[] p = params[i].split("=");
            if (p.length == 2) {
                map.put(p[0], p[1]);
            }
        }
        return map;
    }

    /**
     * 将map转换成url
     * @param map
     * @return
     */
    public static String getUrlParamsByMap(Map<String, Object> map) {
        if (map == null) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(entry.getKey() + "=" + entry.getValue());
            sb.append(";");
        }
        String s = sb.toString();
        if (s.endsWith(";")) {
            s = org.apache.commons.lang3.StringUtils.substringBeforeLast(s, ";");
        }
        return s;
    }

    public static void main(String[] args) {
        String url = "aa=11;bb=22;cc=33";
      Map<String,Object> map =     getUrlParams(url);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
           System.out.println(entry.getKey());
           System.out.println(Integer.parseInt(entry.getValue().toString()));
        }
    }
}
