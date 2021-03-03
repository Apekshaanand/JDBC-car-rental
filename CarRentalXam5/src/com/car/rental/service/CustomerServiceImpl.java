package com.car.rental.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.car.rental.dao.CustomerDAO;
import com.car.rental.dao.CustomerDAOImpl;
import com.car.rental.db.DBUtility;
import com.car.rental.domain.Car;
import com.car.rental.domain.Customer;


public class CustomerServiceImpl implements CustomerService{
	
 	Scanner sc  = new Scanner(System.in);
 	CustomerDAO custDao = new CustomerDAOImpl();
	public void addCustomer(Customer customer){
		System.out.println("Enter the first name");
		String firstname = sc.next();
		System.out.println("Enter the last name");
		String lasttname = sc.next();
		System.out.println("Enter the gender");
		String gender = sc.next();
		System.out.println("Enter the status");
		String status = sc.next();
		System.out.println("Enter the location");
		String location = sc.next();
		System.out.println("Enter the contact");
		String contact = sc.next();
		// do fo all fields which I have menttioned in Customer.java
		
		Customer cust = new Customer();
		cust.setFirstName(firstname);
		// set all value in similar way
		cust.setLastName(lasttname);
		cust.setGender(gender);
		cust.setStatus(status);
		cust.setLocation(location);
		cust.setContact(contact);
		
		
		custDao.addCustomer(cust);
		System.out.println("One Entry Inserted Successfully");
	}

	public Customer getCustomer(int theId){
		Customer cust = null;
		
		
		return null;
		
	}

	public void deleteCustomer(int Id){
		System.out.println("Enter the ID which you want to delete");
		int id = sc.nextInt();
		Customer cust = new Customer();
		cust.setId(id);
		custDao.deleteCustomer(id);;
	 System.out.println("One Entry Deleted Successfully");
		
	}
	
	public void updateCustomer() {
		System.out.println("Enter the ID which you want to update");
		int id = sc.nextInt();
		System.out.println("Enter the new name");
		String name = sc.next();
		System.out.println("Enter the new status");
		String status = sc.next();
		Customer p = new Customer();
		p.setFirstName(name);
		p.setStatus(status);
		p.setId(id);
		custDao.updateCustomer(p);
		//custDao.addCustomer(cust);
		System.out.println("One Entry Updated Successfully");
		
	}

	
}
