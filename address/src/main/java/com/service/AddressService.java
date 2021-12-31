package com.service;

import com.bean.Address;

public interface AddressService {

    public Address findByEmployeeId(long employeeId);
}
