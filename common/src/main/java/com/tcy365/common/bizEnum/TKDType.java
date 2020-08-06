package com.tcy365.common.bizEnum;

public enum TKDType {
    Pc(1, "Pc页面"), Mobile(2, "移动页面");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private int code;
    private String description;

    TKDType(int code, String description) {
        this.code=code;
        this.description=description;
    }

}
