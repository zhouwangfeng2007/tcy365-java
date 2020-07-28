package com.tcy365.common.bizEnum;

public enum IsVisible {
    Visible(1,"显示"),NotVisible(2,"隐藏");

    private int code ;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return discription;
    }

    public void setDescription(String discription) {
        this.discription = discription;
    }

    private String discription;
    IsVisible(int code, String discription) {
        this.code=code;
        this.discription=discription;
    }
}
