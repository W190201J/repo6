package com.attendance.demo.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class TContact implements Serializable {

    private static final long serialVersionUID = 2174128724708791385L;

    private Integer id;
    private String customername;
    private String phone;
    private String content;
    private Date insertDate;

    public long getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(java.sql.Date insertDate) {
        this.insertDate = insertDate;
    }

}
