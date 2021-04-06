package com.hmc.crm.base.utils;

import java.util.UUID;

/**
 * @Author 海梦初
 * @Date 2021/4/6
 * @Time 15:04
 */
public class UUIDUtil {

    public static String UUIDUtil(){

        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
