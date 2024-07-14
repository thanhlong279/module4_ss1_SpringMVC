package com.example.pr2managercustomer.repositories;

import com.example.pr2managercustomer.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository {
    private static List<Customer> customers;
    static {
        customers = new ArrayList<>();
        customers.add(new Customer("TH", "long1@asd",1 , "Long"));
        customers.add(new Customer("HN", "long2@asd",2 , "Long1"));
        customers.add(new Customer("TH", "long3@asd",3 , "Long2"));
        customers.add(new Customer("TN", "long4@asd",4 , "Long3"));
    }
    public List<Customer> findAll() {
        return customers;
    }
}
