/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mesut.springstart.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Mesut
 */
public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(CompanyConfig.class);
        //ctx scan özelliği verilen paketteki config dosyalarını tarar ctx scan kullanırken yukarıdaki
        //applicationcontext() fonksiyonun içine sınıf yazılmaz çünkü verdiğimiz paket aynı işi yapar
        //ctx.scan("com.mesut");
        //ctx.refresh();
        Company company=ctx.getBean("company",Company.class);
        System.out.println("Company name: "+company.getName());
        System.out.println("Company address: "+company.getAddress().getStreet());
        System.out.println("Customer name: "+company.getCustomer().getName());
        System.out.println("Customer adress: "+company.getCustomer().getAddress().getStreet());
        ctx.close();
    }
}
