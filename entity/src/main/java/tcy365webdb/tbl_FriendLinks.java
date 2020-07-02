package tcy365webdb;

import commField.IId;
import lombok.Data;

import java.util.Date;

@Data
public class tbl_FriendLinks implements IId {
    private int tblwebid;
    private String tcyWebUrl;
    private String content;
    private String url;
    private int urltype;
    private int linktarget;
    private int isvisible;
    private Date lastupdatetime  ;
}
