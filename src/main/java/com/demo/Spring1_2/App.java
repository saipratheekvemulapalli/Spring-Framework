package com.demo.Spring1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    
    
    {
    	ApplicationContext con = new AnnotationConfigApplicationContext(Config.class);
    	
       Mobile mobile1 = con.getBean(Mobile.class);
       
       mobile1.Specifications();
    	
    
    	
    	
    }
}
