package com.car.rental.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.car.rental.db.DBUtility;
import com.car.rental.domain.Customer;



public class CustomerDAOImpl implements CustomerDAO {
	DBUtility db = new DBUtility();
 	PreparedStatement pst;
 	ResultSet rs;
 	Customer cust = new Customer();

public void addCustomer(Customer customer){
	try{
	String sql = "insert into customer(firstname,lastname,gender,status,location,contact) values(?,?,?,?,?,?)";
	pst = db.createPST(sql);
	pst.setString(1, customer.getFirstName());
	pst.setString(2, customer.getLastName());

	pst.setString(3, customer.getGender());
	pst.setString(3, customer.getStatus());
	pst.setString(3, customer.getLocation());
	pst.setString(3, customer.getContact());
	int i  =  db.update(pst);
	}
	catch (Exception e) {
		// TODO: handle exception
	}
}

	public Customer getCustomer(int theId){
		
		Customer cust = null;
		
		
		return null;
		
	}

	public void deleteCustomer(int Id){
		String sql = "delete from customer where id=?";
		try{
 		pst = db.createPST(sql);
 		pst.setInt(1,  Id);
 		 db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void updateCustomer(Customer cust) {
		try {
			String sql = "update customer set firstname=?,status=? where id=?";
			pst = db.createPST(sql);
			pst.setString(1, cust.getFirstName());
			pst.setString(2, cust.getStatus());
	

			int i  =  db.update(pst);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
		
}
