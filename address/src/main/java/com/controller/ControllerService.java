package com.controller;

import com.bean.Address;
import com.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/address")
public class ControllerService {

    @Autowired
    AddressService service;

    @GetMapping(path = "/findByEmployeeId/{id}")
    public Address findByEmployeeId(@PathVariable("id") long employeeId){

        return service.findByEmployeeId(employeeId);
    }
}
