package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FaultToleranceController {

    @GetMapping(path = "/faultToleranceForEmployeeService")
    public String faultToleranceForEmployeeService(){

        return "Employee service is under maintenance!!";
    }
}
