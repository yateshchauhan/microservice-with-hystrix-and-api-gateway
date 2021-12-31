package com.controller;

import com.model.Address;
import com.model.Employee;
import com.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;


@RestController
@RequestMapping(path = "employee")
public class ControllerService {

    @Autowired
    private EmployeeService service;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/findById/{id}")
    public Employee findById(@PathVariable("id") Long id){

        System.out.println("Received input ID:"+id);
        Employee employee = service.findById(id);
        Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/address/findByEmployeeId/"+id, Address.class);
        employee.setAddressList(new ArrayList<Address>(){{add(address);}});
        return employee;
    }
}
