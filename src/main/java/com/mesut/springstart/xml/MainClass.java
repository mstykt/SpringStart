/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mesut.springstart.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mesut
 */
public class MainClass {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("SpringXMLConfig.xml");
        Company c=ctx.getBean("company",Company.class);
        System.out.println("Company name: "+c.getName());
        System.out.println("Company addres: "+c.getAddress().getStreet());
        System.out.println("Customer name: "+c.getCustomer().getName());
        System.out.println("Customer adress: "+c.getCustomer().getAddress().getStreet());
        ctx.close();
    }
}
