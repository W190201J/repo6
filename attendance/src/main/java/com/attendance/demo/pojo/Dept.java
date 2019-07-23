package com.attendance.demo.pojo;

import java.io.Serializable;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class Dept implements Serializable {

    private static final long serialVersionUID = 4192546459114514781L;

    private Integer deptid;
    private String deptname;

    public long getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

}
