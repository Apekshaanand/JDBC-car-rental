package com.car.rental.service;

import java.sql.SQLException;

import com.car.rental.domain.Car;
import com.car.rental.domain.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int Id);
	
	public void updateCustomer() ;



}
