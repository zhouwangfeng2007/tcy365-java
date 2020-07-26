package com.tcy365.common;

import java.io.Serializable;

public class Tcy365Result<T> implements Serializable {
    private int code;
    private String msg;
    private T data;


    public static <T> Tcy365Result<T>  Success(T data) {
        Tcy365Result<T> res = new Tcy365Result<T>();
        res.setCode(0);
        res.setData(data);
        res.setMsg(null);
        return res;
    }

    public static <T> Tcy365Result<T> Failure(int code,String msg) {
        Tcy365Result<T> res = new Tcy365Result<T>();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(null);
        return res;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


}
