package com.attendance.demo.dao;

import com.attendance.demo.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceDao {

    /**
     * GRC
     * @param customer
     * @return
     */
    @Insert("insert into customer(username,password,name,sex,address,mobile,typesid,deptid) values(#{username},#{password},#{name},#{sex},#{address},#{mobile},#{types.typesid},#{dept.deptid})")
    public int insertAtten(Customer customer);

    @Select("select password,name,sex,address,mobile,typesid,deptid from customer where username=#{username}")
    @Results({
            @Result(property = "types.typesid" ,column = "typesid"),
            @Result(property = "dept.deptid" ,column = "deptid")
    })
    public Customer queryByID(String username);
}
