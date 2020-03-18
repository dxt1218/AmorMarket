package com.amor.market.amormarketcore.util;


import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
public class ModelHelper {
    /**
     * 反射  插入初始化类
     */
    public static void initModel(Object obj) {
        //获取 对象所有属性
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                String fieldName = field.getName();
                field.setAccessible(true);
                if ("createTime".equals(fieldName)) {
                    field.set(obj, LocalDateTime.now());
                }
                if ("state".equals(fieldName)) {
                    field.set(obj,"1");
                }
            } catch (IllegalAccessException e) {
                log.error("反射赋值异常");
                log.info("反射赋值异常{}",e);
            }
        }
    }


    /**
     * 反射  更新
     */
    public static void updateModel(Object obj) {
        //获取 对象所有属性
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            try {
                String fieldName = field.getName();
                field.setAccessible(true);
                if ("updateTime".equals(fieldName)) {
                    field.set(obj, LocalDateTime.now());
                }

            } catch (IllegalAccessException e) {
                log.error("反射赋值异常");
                log.info("反射赋值异常{}",e);
            }
        }
    }
}
