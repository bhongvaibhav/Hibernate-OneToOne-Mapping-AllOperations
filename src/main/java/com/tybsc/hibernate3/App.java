package com.tybsc.hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tybsc.hibernate3_OneToOneAllop.Address;
import com.tybsc.hibernate3_OneToOneAllop.Employee;

//import com.tybsc.hibernate2_OneToOne.Address;
//import com.tybsc.hibernate2_OneToOne.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

    
    Address add1 = new Address("LMN","Baramati","Maharashtra","India");
    Employee emp1 = new Employee("ABC","XYZ",5000,add1);
    
    session.save(add1);
    session.save(emp1);
    
    tx.commit();
    
    session.close();
    factory.close();
    }
}
