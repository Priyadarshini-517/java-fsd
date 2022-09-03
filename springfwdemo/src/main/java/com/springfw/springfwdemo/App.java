package com.springfw.springfwdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        @SuppressWarnings("resource")
		ApplicationContext obj= new ClassPathXmlApplicationContext("com/springfw/springfwdemo/index.xml");
        Vehicle veh=(Vehicle)obj.getBean("car");
        System.out.println(veh);
        veh.drive();
    }
}
