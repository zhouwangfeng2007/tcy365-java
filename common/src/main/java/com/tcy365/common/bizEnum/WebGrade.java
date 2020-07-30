package com.tcy365.common.bizEnum;

import lombok.Data;

public enum WebGrade {
    City(1, "地级市"), Country(2, "县区级");

    public static String getDescription(Integer code) {
        switch (code) {
            case 1:
                return "地级市";
            case 2:
                return "县级市";
        }
        return code.toString();
    }

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    WebGrade(int code, String desc) {
        this.code = code;
        this.description = desc;
    }
}
