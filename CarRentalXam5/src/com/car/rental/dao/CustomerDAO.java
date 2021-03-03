package com.car.rental.dao;

import com.car.rental.domain.Customer;

public interface CustomerDAO {

	public void addCustomer(Customer customer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int Id);
	
	public void updateCustomer(Customer cust) ;

}
