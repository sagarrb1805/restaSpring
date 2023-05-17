package com.example.resta.Repository;

import com.example.resta.Schema.Customer;
import com.example.resta.Schema.UserOrder;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo  extends CrudRepository<UserOrder, Integer> {

}
