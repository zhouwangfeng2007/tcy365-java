package com.tcy365.common.bizEnum;

public enum PcGameClass {
    PaiLei(1000, "牌类"),
    MaJiang(2000, "麻将"),
    QiLei(3000, "棋类"),
    XiuXian(4000, "休闲"),
    QiTa(5000, "其他");

    public static String getDescription(Integer code) {
        switch (code) {
            case 1000:
                return "牌类";
            case 2000:
                return "麻将";
            case 3000:
                return "棋类";
            case 4000:
                return "休闲";
            case 5000:
                return "其他";
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
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    PcGameClass(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
