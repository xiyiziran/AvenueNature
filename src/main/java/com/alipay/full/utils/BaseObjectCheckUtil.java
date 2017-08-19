/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.alipay.full.utils;

import org.jetbrains.annotations.Contract;

/**
 * @author wujing.ch
 * @version $Id: BaseObjectCheckUtil.java, v 0.1 2017-08-19 上午10:00 wujing.ch Exp $$
 */
public class BaseObjectCheckUtil {


    public static boolean checkObjectIsNull(Object... objects){
        for (int index=0;index<objects.length;index++){
            if (null == objects[index]){
                return true;
            }
        }
        return false;

    }

    public static boolean checkObjectIsNotNull(Object... objects){
        if (checkObjectIsNull(objects)){
            return false;
        }
        return true;
    }
}