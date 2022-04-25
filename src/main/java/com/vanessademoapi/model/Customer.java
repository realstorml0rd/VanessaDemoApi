package com.vanessademoapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(nullable = false, unique = true)
    private String firstName;

    @Column(nullable = false, unique = true)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String emailAddress;

    @Column(nullable = false, unique = true)
    private Long phoneNumber;

    @Column(nullable = true, unique = true)
    private String streetAddress;

    @Column(nullable = false, unique = false)
    private String city;

    @Column(nullable = false, unique = false)
    private String state;

    @Column(nullable = false,unique = false)
    private Integer zipCode;

    @Column(nullable = false, unique = false)
    private String businessType;

    public Customer(String firstName, Integer age) {

        super();
        this.firstName = firstName;


    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {return lastName; }

    public String getEmailAddress() {return emailAddress; }

    public Long getPhoneNumber() {return phoneNumber; }

    public String getStreetAddress() {return streetAddress; }

    public String getCity() {return city; }

    public String getState() {return state; }

    public Integer getZipCode() {return zipCode; }

    public String getBusinessType() {return businessType; }

    public long getId() { return id; }
}
