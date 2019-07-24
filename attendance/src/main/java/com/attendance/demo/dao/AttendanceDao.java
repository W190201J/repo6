package com.attendance.demo.dao;

import com.attendance.demo.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceDao {

    @Insert("insert into customer(username,password,name,sex,address,mobile,typesid,deptid) values(#{username},#{password},#{name},#{sex},#{address},#{mobile},#{types.typesid},#{dept.deptid})")
    public int insertAtten(Customer customer);
}
