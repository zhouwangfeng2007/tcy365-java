package com.tcy365.entity.tcy365web;
import com.tcy365.entity.common.IId;
import lombok.Data;
import java.util.Date;
@Data
public class tblWeb implements IId {
    private String webname;
    private String webnameshort;
    private String webspelling;
    private int channelid;
    private int webgrade;
    private String webarea;
    private String weburl;
    private String webdomain;
    private int isaudit = 1;
    private String title;
    private String keywords;
    private String description;
    private String friendlinks;
    private String indexstatjs;
    private int isvisible;
    private Date createtime;
    private Date lastupdatetime;
}
