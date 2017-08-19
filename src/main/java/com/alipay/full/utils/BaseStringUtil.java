/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.alipay.full.utils;

/**
 * @author wujing.ch
 * @version $Id: BaseStringUtil.java, v 0.1 2017-08-19 上午9:59 wujing.ch Exp $$
 */
public abstract class BaseStringUtil {
    /*
   * 检查字符串对象是否为empty
   * */
    public static boolean isEmpty(Object o){
        if(null == o){
            return false;
        }
        if(o instanceof  String && "".equals(o)) {
            return true;
        }else {
            return false;
        }
    }
}