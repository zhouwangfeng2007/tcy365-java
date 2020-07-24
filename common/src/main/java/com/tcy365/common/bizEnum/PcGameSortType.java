package com.tcy365.common.bizEnum;

public enum PcGameSortType {
    MainWebPublic(1, "主站公共游戏排序"),
    PcWebLocalGame(6, "分站本地游戏排序"),
    MobileWebLocalGame(7, "移动本地游戏排序");
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    PcGameSortType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}

