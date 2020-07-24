package com.tcy365.entity.tcy365webdb;

import java.util.Date;

public class tbl_GameDetailPage {
    private Integer id;

    private Integer gameid;

    private String gameshort;

    private String gamename;

    private String area;

    private String title;

    private String keywords;

    private String description;

    private Integer isdefault;

    private Integer isvisible;

    private Integer isaudit;

    private Date lastupdatetime;

    private String gamedetail2;

    private String gamedetail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGameid() {
        return gameid;
    }

    public void setGameid(Integer gameid) {
        this.gameid = gameid;
    }

    public String getGameshort() {
        return gameshort;
    }

    public void setGameshort(String gameshort) {
        this.gameshort = gameshort;
    }

    public String getGamename() {
        return gamename;
    }

    public void setGamename(String gamename) {
        this.gamename = gamename;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public Integer getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Integer isvisible) {
        this.isvisible = isvisible;
    }

    public Integer getIsaudit() {
        return isaudit;
    }

    public void setIsaudit(Integer isaudit) {
        this.isaudit = isaudit;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public String getGamedetail2() {
        return gamedetail2;
    }

    public void setGamedetail2(String gamedetail2) {
        this.gamedetail2 = gamedetail2;
    }

    public String getGamedetail() {
        return gamedetail;
    }

    public void setGamedetail(String gamedetail) {
        this.gamedetail = gamedetail;
    }
}