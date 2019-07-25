package com.attendance.demo.controller;

import com.attendance.demo.pojo.Customer;
import com.attendance.demo.service.AttendanceService;
import com.attendance.demo.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Resource(name = "AttendanceServiceImpl")
    private AttendanceService attendanceService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

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
            return new ResponseEntity<>("no",HttpStatus.OK);
        }
        return new ResponseEntity<>("no",HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestParam("username") String username, @RequestParam("password") String password){
        Customer customer1=attendanceService.selectById(username);
        if(customer1!=null){
            if(!customer1.getPassword().equals(password)){
                return new ResponseEntity<>("no_pass",HttpStatus.OK);
            }
            String token=jwtTokenUtil.createToken(username,password);
            return new ResponseEntity<String>(token ,HttpStatus.OK);
        }
        return new ResponseEntity<>("no",HttpStatus.OK);
    }
}
