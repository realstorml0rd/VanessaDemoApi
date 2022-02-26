package com.vanessademoapi;

import com.vanessademoapi.model.Customer;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppConfigurationTests {

    @Mock
    private Customer customer;

    @Test
    void contextLoads() {
    }

    @Test
    void basicMethodCallCheck_happyPath() {

        Mockito.verify(customer, Mockito.times(2)).getFirstName();

    }

}
