package com.tcy365.entity.tcy365webdb;

import java.util.Date;

public class tbl_PCBanner {
    private Integer id;

    private String bannername;

    private String imagerelativepath;

    private String linkurl;

    private String imagetag;

    private Integer websitetype;

    private Integer tblwebid;

    private Integer sortid;

    private Date lastupdatetime;

    private Date validbegintime;

    private Date validendtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannername() {
        return bannername;
    }

    public void setBannername(String bannername) {
        this.bannername = bannername;
    }

    public String getImagerelativepath() {
        return imagerelativepath;
    }

    public void setImagerelativepath(String imagerelativepath) {
        this.imagerelativepath = imagerelativepath;
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl;
    }

    public String getImagetag() {
        return imagetag;
    }

    public void setImagetag(String imagetag) {
        this.imagetag = imagetag;
    }

    public Integer getWebsitetype() {
        return websitetype;
    }

    public void setWebsitetype(Integer websitetype) {
        this.websitetype = websitetype;
    }

    public Integer getTblwebid() {
        return tblwebid;
    }

    public void setTblwebid(Integer tblwebid) {
        this.tblwebid = tblwebid;
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

    public Date getValidbegintime() {
        return validbegintime;
    }

    public void setValidbegintime(Date validbegintime) {
        this.validbegintime = validbegintime;
    }

    public Date getValidendtime() {
        return validendtime;
    }

    public void setValidendtime(Date validendtime) {
        this.validendtime = validendtime;
    }
}