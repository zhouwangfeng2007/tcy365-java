package com.tcy365.entity.tcy365web;
import com.tcy365.entity.common.IId;
import lombok.Data;
import java.util.Date;
@Data
public class tblFriendLinks implements IId {
    private int tblwebid;
    private String tcyWebUrl;
    private String content;
    private String url;
    private int urltype;
    private int linktarget;
    private int isvisible;
    private Date lastupdatetime  ;
}
