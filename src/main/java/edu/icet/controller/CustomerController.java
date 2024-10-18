package edu.icet.controller;

import edu.icet.dto.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping
    public Customer getCustomer(){
        return new Customer(1,"Kasun","Galle");
    }
}
