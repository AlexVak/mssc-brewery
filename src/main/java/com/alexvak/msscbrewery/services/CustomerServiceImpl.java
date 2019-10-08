package com.alexvak.msscbrewery.services;

import com.alexvak.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("Test Customer")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .customerName("New Customer")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo implement method
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer ...");
    }
}
