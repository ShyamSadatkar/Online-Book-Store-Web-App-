package com.minicrm.controller;

import com.minicrm.entity.Customer;
import com.minicrm.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<Customer> getAll() {
        return customerService.getAllCustomers();
    }

    @PostMapping
    public Customer add(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);
    }
}