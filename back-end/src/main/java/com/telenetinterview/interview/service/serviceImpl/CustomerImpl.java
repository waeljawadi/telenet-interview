package com.telenetinterview.interview.service.serviceImpl;

import com.telenetinterview.interview.entity.Customer;
import com.telenetinterview.interview.repository.CustomerRepository;
import com.telenetinterview.interview.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer createCustomer(Customer customer) {
        // Check if email contains @ and .
        return (customer.getEmail().indexOf("@") > -1 && customer.getEmail().indexOf(".") > 0)
                ? customerRepository.save(customer)
                : null;
    }

    // Get a list of all customers
    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    // get all customers from given country
    @Override
    public List<Customer> getCustomersByCountry(String country) {
        return customerRepository.findAllByCountry(country);
    }
}
