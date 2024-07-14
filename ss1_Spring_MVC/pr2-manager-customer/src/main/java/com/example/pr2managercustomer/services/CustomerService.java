package com.example.pr2managercustomer.services;

import com.example.pr2managercustomer.models.Customer;
import com.example.pr2managercustomer.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> findALl() {
        return customerRepository.findAll();
    }
}
