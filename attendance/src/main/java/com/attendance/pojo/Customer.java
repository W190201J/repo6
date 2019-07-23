package com.attendance.pojo;

import java.io.Serializable;

/**
 * @author _Heyuhao
 * @date 2019/7/23
 */
public class Customer implements Serializable {

    private static final long serialVersionUID = -4722395012468864281L;
    
    private String username;
    private String password;
    private String name;
    private String sex;
    private String address;
    private String mobile;
    private Integer typesid;
    private Integer deptid;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getTypesid() {
        return typesid;
    }

    public void setTypesid(Integer typesid) {
        this.typesid = typesid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }
}
