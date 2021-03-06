package org.cdk.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/cdk/annotation/appCxt.xml");
        Employee employee= (Employee) context.getBean("employee");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}