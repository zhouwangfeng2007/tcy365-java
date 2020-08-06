package com.tcy365.entity.tcy365webdb;

import lombok.Data;

import java.util.Date;
@Data
public class tbl_Tkd {
    public Integer id;

    public Integer tkdtype;

    public Integer isvisible;

    public Integer webid;

    public String pageurl;

    public String title;

    public String keywords;

    public String discription;

    public Date lastupdatetime;


}