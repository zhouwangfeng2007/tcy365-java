package com.tcy365.entity.tcy365webdb;

import java.util.Date;

public class tbl_FriendLinks {
    private Integer id;

    private Integer tblwebid;

    private String tcyweburl;

    private String content;

    private String url;

    private Integer urltype;

    private Integer linktarget;

    private Integer isvisible;

    private Date lastupdatetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTblwebid() {
        return tblwebid;
    }

    public void setTblwebid(Integer tblwebid) {
        this.tblwebid = tblwebid;
    }

    public String getTcyweburl() {
        return tcyweburl;
    }

    public void setTcyweburl(String tcyweburl) {
        this.tcyweburl = tcyweburl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getUrltype() {
        return urltype;
    }

    public void setUrltype(Integer urltype) {
        this.urltype = urltype;
    }

    public Integer getLinktarget() {
        return linktarget;
    }

    public void setLinktarget(Integer linktarget) {
        this.linktarget = linktarget;
    }

    public Integer getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Integer isvisible) {
        this.isvisible = isvisible;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }
}