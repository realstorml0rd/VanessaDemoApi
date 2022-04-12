package com.vanessademoapi.controller;

import com.vanessademoapi.exception.CustomerIdMismatchException;
import com.vanessademoapi.exception.CustomerNotFoundException;
import com.vanessademoapi.model.Customer;
import com.vanessademoapi.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public Iterable findAll() {
        return customerRepository.findAll();
    }

    @GetMapping("/customer/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        List<Customer> results = customerRepository.findByFirstName(firstName);
        if (results.isEmpty()) {
            throw new CustomerNotFoundException("Customer not found in database.");
        } else {
            return results;
        }
    }

    @GetMapping("/{id}")
    public Customer findOne(@PathVariable Long id) {
        return customerRepository.findById(id)
                .orElseThrow(CustomerNotFoundException::new);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer create(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        customerRepository.findById(id)
                .orElseThrow(CustomerNotFoundException::new);
        customerRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id) {
        if (customer.getId() != id) {
            throw new CustomerIdMismatchException();
        }
        customerRepository.findById(id)
                .orElseThrow(CustomerNotFoundException::new);
        return customerRepository.save(customer);
    }
}
