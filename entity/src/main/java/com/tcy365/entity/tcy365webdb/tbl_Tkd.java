package com.tcy365.entity.tcy365webdb;

import java.util.Date;

public class tbl_Tkd {
    private Integer id;

    private Integer tkdtype;

    private Integer isvisible;

    private Integer webid;

    private String pageurl;

    private String title;

    private String keywords;

    private String discription;

    private Date lastupdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTkdtype() {
        return tkdtype;
    }

    public void setTkdtype(Integer tkdtype) {
        this.tkdtype = tkdtype;
    }

    public Integer getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Integer isvisible) {
        this.isvisible = isvisible;
    }

    public Integer getWebid() {
        return webid;
    }

    public void setWebid(Integer webid) {
        this.webid = webid;
    }

    public String getPageurl() {
        return pageurl;
    }

    public void setPageurl(String pageurl) {
        this.pageurl = pageurl;
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

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}