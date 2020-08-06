package com.tcy365.entity.dto;

import com.tcy365.entity.tcy365webdb.tbl_Web;
import lombok.Data;

@Data
public class UpdateWebInput extends tbl_Web {
   public String mTitle;
   public String mDescription;
   public String mKeyWords;
}
