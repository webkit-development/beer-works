package com.stradtkt.beerworks.services;

import com.stradtkt.beerworks.web.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer getCustomerById(UUID customerId) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .name("Paul Smith")
                .build();
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        return Customer.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, Customer customer) {

    }

    @Override
    public void deleteById(UUID customerId) {
      log.debug("Logging the delete in customers");
    }
}
