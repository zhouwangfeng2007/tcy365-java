package tcy365webdb;

import commField.IId;
import lombok.Data;

import java.util.Date;

@Data
public class tbl_web implements IId {
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
