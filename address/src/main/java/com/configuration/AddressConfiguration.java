package com.configuration;

import com.bean.Address;
import com.service.AddressService;
import com.service.AddressServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressConfiguration {


    @Bean
    public AddressService getAddressService(){
        return new AddressServiceImpl();
    }
}
