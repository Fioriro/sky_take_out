package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 用于完成插入、更新操作时对时间和操作人的自动填充
 */
@Target({ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    //数据库操作类型：UPDATE,INSERT
    OperationType value();
}
