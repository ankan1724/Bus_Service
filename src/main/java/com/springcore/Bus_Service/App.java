package com.springcore.Bus_Service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/Bus_Service/service.xml");
        Service bus1=(Service) context.getBean("bus1");
        System.out.println(bus1);
        
        Service bus2=(Service) context.getBean("bus2");
        System.out.println(bus2);
        
    }
}
