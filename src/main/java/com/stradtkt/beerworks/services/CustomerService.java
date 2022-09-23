package com.stradtkt.beerworks.services;

import com.stradtkt.beerworks.web.model.Customer;

import java.util.UUID;

public interface CustomerService {
    Customer getCustomerById(UUID customerId);

    Customer saveNewCustomer(Customer customer);

    void updateCustomer(UUID customerId, Customer customer);

    void deleteById(UUID customerId);
}
