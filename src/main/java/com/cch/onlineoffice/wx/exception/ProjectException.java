package com.cch.onlineoffice.wx.exception;

import lombok.Data;

/**
 * @author cch
 * @create 2022-11-07 11:16
 */
@Data
public class ProjectException extends RuntimeException {
    private String msg;
    private int code = 500;

    public ProjectException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public ProjectException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public ProjectException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public ProjectException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
