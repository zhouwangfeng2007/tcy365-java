package com.tcy365.entity.dto;

public class AreaInfo {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AreaInfo(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
