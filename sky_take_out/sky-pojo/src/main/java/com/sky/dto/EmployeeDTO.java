package com.sky.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 员工数据传输对象
 * 因为entity包含所有属性，而这些属性在传输中不需要
 * 因此把entity简化为一个DTO，这样可以只传输需要的属性
 * 从而提高系统性能
 */
@Data
public class EmployeeDTO implements Serializable {

    private Long id;

    private String username;

    private String name;

    private String phone;

    private String sex;

    private String idNumber;

}
