package com.tzh.manage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "t_staff")
public class Staff implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 姓名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 身份证号
     */
    @TableField(value = "id_number")
    private String idNumber;

    /**
     * 出生日期
     */
    @TableField(value = "date_birth")
    private Date dateBirth;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private String gender;

    /**
     * 入职日期
     */
    @TableField(value = "date_entry")
    private Date dateEntry;

    /**
     * 部门
     */
    @TableField(value = "department")
    private Integer department;

    /**
     * 职位
     */
    @TableField(value = "`position`")
    private Integer position;

    /**
     * 电话号码
     */
    @TableField(value = "telephone_number")
    private String telephoneNumber;

    /**
     * 备注
     */
    @TableField(value = "note")
    private String note;

    private static final long serialVersionUID = 1L;
}