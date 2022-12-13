package com.cch.onlineoffice.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 疫情城市列表
 * @TableName tb_city
 */
@Data
public class City implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 城市名称
     */
    private String city;

    /**
     * 拼音简称
     */
    private String code;

    private static final long serialVersionUID = 1L;
}