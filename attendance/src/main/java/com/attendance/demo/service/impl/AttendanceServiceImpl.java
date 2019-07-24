package com.attendance.demo.service.impl;

import com.attendance.demo.dao.AttendanceDao;
import com.attendance.demo.pojo.Customer;
import com.attendance.demo.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AttendanceServiceImpl")
public class AttendanceServiceImpl implements AttendanceService {

    @Autowired
    private AttendanceDao attendanceDao;

    @Override
    public int addAtten(Customer customer) {
        return attendanceDao.insertAtten(customer);
    }
}
