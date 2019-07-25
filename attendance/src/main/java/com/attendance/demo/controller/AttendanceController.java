package com.attendance.demo.controller;

import com.attendance.demo.pojo.Customer;
import com.attendance.demo.service.AttendanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Resource(name = "AttendanceServiceImpl")
    private AttendanceService attendanceService;

    /**
     * GRC注册
     * @param customer
     * @return
     */
    @PostMapping("/zhuce")
    public ResponseEntity<?> addAtten(@RequestBody Customer customer){
        Customer customer1=attendanceService.selectById(customer.getUsername());
        if(customer1==null){
            int i=attendanceService.addAtten(customer);
            if(i>0){
                return new ResponseEntity<>("ok",HttpStatus.OK);
            }
            return new ResponseEntity<>("no",HttpStatus.SERVICE_UNAVAILABLE);
        }
        return new ResponseEntity<>("no",HttpStatus.CONFLICT);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Customer customer){
       Customer customer1=attendanceService.selectById(customer.getUsername());
       if(customer1!=null){
           //登录成功

       }
       //登录失败
    }
}
