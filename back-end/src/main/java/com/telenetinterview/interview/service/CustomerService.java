package com.telenetinterview.interview.service;

import com.telenetinterview.interview.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);

    List<Customer> getCustomers();

    List<Customer> getCustomersByCountry(String country);
}
