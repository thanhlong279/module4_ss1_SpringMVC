package com.example.pr2managercustomer.controllers;

import com.example.pr2managercustomer.models.Customer;
import com.example.pr2managercustomer.services.CustomerService;
import com.example.pr2managercustomer.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/customers")
    public String showList(Model model) {
        List<Customer> customers = customerService.findALl();
        model.addAttribute("customers", customers);
        return "customers/list";
    }
}
