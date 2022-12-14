package com.cch.onlineoffice.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName tb_dept
 */
@Data
public class Dept implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String deptName;

    private static final long serialVersionUID = 1L;
}