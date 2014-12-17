/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mesut.springstart.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Mesut
 */
@Configuration
public class CompanyConfig {
    @Bean
    public Address customerAddress(){
        Address a=new Address();
        a.setStreet("Customer Address");
        return a;
    }
    @Bean
    public Address customerAddress2(){
        Address a=new Address();
        a.setStreet("Customer Addddddddddd");
        return a;
    }
    @Bean
    public Address companyAddress(){
        Address a=new Address();
        a.setStreet("Company Streetttttt");
        return a;
    }
    @Bean
    public Customer customer(){
        Customer c=new Customer();
        c.setName("Mesut");
        //Git Customer sınıfına @utowired(@Resource) annotasyonu ekle aşağıdaki işlemin aynısını yapar
        //c.setAddress(customerAddress());
        return c;
    }
    @Bean
    public Company company(){
        Company c=new Company();
        c.setName("My Company");
        c.setAddress(companyAddress());
        c.setCustomer(customer());
        return c;
    }
}
