package com.car.rental.domain;
import java.util.*;
import java.io.*;

///////////////////////////////////////////////Customer Class///////////////////////////////
public class Customer {

	private String firstName, lastName, gender, status, location, contact;
	private int id;
	
	public Customer() {
	
		firstName = "";
		lastName = "";
		gender = "";
		status = "";
		location = "";
		contact = "";
	}
	
	public void setCustomer(String fN, String lN, String g, String s, String l, String c){
		
		firstName = fN;
		lastName = lN;
		gender = g;
		status = s;
		location = l;
		contact = c;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}
	
//	public void saveToFile() throws IOException {
		
//		PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("Customers_Inventory.txt"), true));
//  	outFile.println(getFullName() + " " + getGender() + " " 
//	  	+ getLocation() + " " + getContact() + " " + getStatus());
//	 	outFile.close();
 //	}
}