package com.attendance.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class TJjr implements Serializable {

    private static final long serialVersionUID = -7631626664642779661L;

    private Integer id;
    private Date v1;
    private String v2;
    private String v3;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getV1() {
        return v1;
    }

    public void setV1(java.sql.Date v1) {
        this.v1 = v1;
    }

    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

}
