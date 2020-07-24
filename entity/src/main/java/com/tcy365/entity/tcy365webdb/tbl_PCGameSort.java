package com.tcy365.entity.tcy365webdb;

import java.util.Date;

public class tbl_PCGameSort {
    private Integer id;

    private Integer tblwebid;

    private Integer gameid;

    private String gameshort;

    private String gamename;

    private Integer sorttype;

    private Integer sortid;

    private Date lastupdatetime;

    private Integer onlinenum;

    private Integer tblgdpid;

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

    public Integer getSorttype() {
        return sorttype;
    }

    public void setSorttype(Integer sorttype) {
        this.sorttype = sorttype;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public Date getLastupdatetime() {
        return lastupdatetime;
    }

    public void setLastupdatetime(Date lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }

    public Integer getOnlinenum() {
        return onlinenum;
    }

    public void setOnlinenum(Integer onlinenum) {
        this.onlinenum = onlinenum;
    }

    public Integer getTblgdpid() {
        return tblgdpid;
    }

    public void setTblgdpid(Integer tblgdpid) {
        this.tblgdpid = tblgdpid;
    }
}