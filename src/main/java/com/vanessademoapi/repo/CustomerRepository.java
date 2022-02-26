package com.vanessademoapi.repo;

import com.vanessademoapi.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByFirstName(String firstName);
}
