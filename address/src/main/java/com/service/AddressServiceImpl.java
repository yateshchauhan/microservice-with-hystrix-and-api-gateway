package com.service;

import com.bean.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressServiceImpl implements AddressService {

    List<Address> addressList = new ArrayList<Address>(){
        {
            add(new Address(1l, "Modipuram Meerut", "Bangalore Karnataka"));
            add(new Address(2l, "Noida UP", "Pune Maharastra"));
        }
    };

    public Address findByEmployeeId(long employeeId){

        return addressList.stream().filter(address -> address.getEmployeeId() == employeeId).findAny().orElse(new Address());
    }
}
