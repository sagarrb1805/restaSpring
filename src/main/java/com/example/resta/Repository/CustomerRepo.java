package com.example.resta.Repository;

import com.example.resta.Schema.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer, Integer> {
}
