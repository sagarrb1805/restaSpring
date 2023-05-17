package com.example.resta.Services;

import com.example.resta.Repository.CustomerRepo;
import com.example.resta.Schema.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerSeriviceIm implements CustomerService{
    @Autowired
    private CustomerRepo cutomerRepo;
    @Override
    public Customer addCustomer(Customer cust) {
        cutomerRepo.save(cust);
        return cust;
    }
}
