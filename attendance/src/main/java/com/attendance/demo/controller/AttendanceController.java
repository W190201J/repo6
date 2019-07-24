package com.attendance.demo.controller;

import com.attendance.demo.pojo.Customer;
import com.attendance.demo.service.AttendanceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Resource(name = "AttendanceServiceImpl")
    private AttendanceService attendanceService;

    @PostMapping("/zhuce")
    public ResponseEntity<?> addAtten(@RequestBody Customer customer){
        return  new ResponseEntity<>("aaa", HttpStatus.OK);
    }
}
