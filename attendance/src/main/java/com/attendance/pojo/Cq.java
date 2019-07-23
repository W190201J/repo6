package com.attendance.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class Cq implements Serializable {

    private static final long serialVersionUID = -375401417471366073L;
    private Integer cqid;
    private String name;
    private Date d1;
    private String d2;

    public Integer getCqid() {
        return cqid;
    }

    public void setCqid(Integer cqid) {
        this.cqid = cqid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }
}
