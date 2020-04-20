package com.shreeraksha.Spring_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args, String CustomerService )
    {
    ApplicationContext context = new ClassPathXmlApplicationContext("Customer.xml");
    CustomerService cust = (CustomerService)context.getBean(CustomerService);
    System.out.println(cust);
    }
}
