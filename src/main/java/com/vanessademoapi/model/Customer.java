package com.vanessademoapi.model;

import javax.persistence.*;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String firstName;

    @Column(nullable = false)
    private Integer age;

    public Customer(String firstName, Integer age) {

        super();
        this.firstName = firstName;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getAge() { return age; }

    public long getId() { return id; }
}
