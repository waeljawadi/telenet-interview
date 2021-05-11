package com.telenetinterview.interview.controller;

import com.telenetinterview.interview.entity.Customer;
import com.telenetinterview.interview.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> customers() {
        return new ResponseEntity<>(customerService.getCustomers(), HttpStatus.OK);
    }

    @GetMapping("/country/{country}")
    public ResponseEntity<List<Customer>> customersFromBelgium(final @PathVariable String country) {
        return new ResponseEntity<>(customerService.getCustomersByCountry(country), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Customer> customer(final @RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.OK);
    }


}
