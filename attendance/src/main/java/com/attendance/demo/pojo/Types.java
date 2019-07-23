package com.attendance.demo.pojo;

import java.io.Serializable;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class Types implements Serializable {

    private static final long serialVersionUID = -2974919215154094420L;
    private Integer typesid;
    private String tTypes;

    public long getTypesid() {
        return typesid;
    }

    public void setTypesid(Integer typesid) {
        this.typesid = typesid;
    }

    public String getTTypes() {
        return tTypes;
    }

    public void setTTypes(String tTypes) {
        this.tTypes = tTypes;
    }

}
