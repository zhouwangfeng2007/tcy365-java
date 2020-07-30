package com.tcy365.common.bizEnum;

public enum IsVisible {
    Visible(1, "显示"), NotVisible(-1, "隐藏");

    public static String getDescription(Integer code) {
        switch (code) {
            case 1:
                return "显示";
            case -1:
                return "隐藏";
        }
        return code.toString();
    }

    private int code;

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
        this.code = code;
        this.discription = discription;
    }


}
