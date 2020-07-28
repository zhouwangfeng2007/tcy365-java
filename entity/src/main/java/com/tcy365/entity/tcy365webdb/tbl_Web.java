package com.tcy365.entity.tcy365webdb;

import com.tcy365.entity.Abstract.*;
import lombok.Data;


import java.util.Date;
@Data
public class tbl_Web   {

    public Integer id;

    public String webname;

    public String webnameshort;

    public String webspelling;

    public Integer channelid;

    public Integer webgrade;

    public String webarea;

    public String weburl;

    public String webdomain;

    public Integer isaudit;

    public String title;

    public String keywords;

    public String description;

    public String indexstatjs;

    public Integer isvisible;

    public Date createtime;

    public Date lastupdatetime;

    public String friendlinks;


}