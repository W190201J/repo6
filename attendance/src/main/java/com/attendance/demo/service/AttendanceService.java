package com.attendance.demo.service;

import com.attendance.demo.pojo.Customer;

public interface AttendanceService {

    /**
     *GRC
     * @param customer
     * @return
     */
    public int addAtten(Customer customer);

    public Customer selectById(String username);
}
