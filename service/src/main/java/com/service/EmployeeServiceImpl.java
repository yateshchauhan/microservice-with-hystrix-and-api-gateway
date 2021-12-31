package com.service;

import com.model.Address;
import com.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private List<Employee> employeeList = new ArrayList<Employee>(){
        {
            add(new Employee(1l, "Ram", 20, null/*new ArrayList<Address>(){
                {
                    add(new Address("Modipuram Meerut", "Bangalore Karnataka"));
                }
            }*/));
            add(new Employee(2l, "Shyam", 22, null/*new ArrayList<Address>(){
                {
                    add(new Address("Noida UP", "Bangalore Karnataka"));
                }
            }*/));

        }
    };

    private Employee defaultEmployee = new Employee(0, "Ram", 20, new ArrayList<Address>(){
        {
            add(new Address("Modipuram Meerut", "Bangalore Karnataka"));
        }
    });

    @Override
    public Employee findById(long id){

        return employeeList.stream().filter(employee -> employee.getId() == id).findFirst().orElse(defaultEmployee);
    }
}
